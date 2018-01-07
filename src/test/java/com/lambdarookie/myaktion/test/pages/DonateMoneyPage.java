package com.lambdarookie.myaktion.test.pages;

import static org.jboss.arquillian.graphene.Graphene.guardHttp;

import com.lambdarookie.myaktion.model.Donation;
import java.text.NumberFormat;
import java.util.Locale;
import org.jboss.arquillian.graphene.page.Location;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Location("donateMoney.jsf")
public class DonateMoneyPage extends AbstractPage {
  @FindBy(xpath = "//input[contains(@id, 'name')]")
  private WebElement name;
  @FindBy(xpath = "//input[contains(@id, 'iban')]")
  private WebElement iban;
  @FindBy(xpath = "//input[contains(@id, 'name_bank')]")
  private WebElement nameBank;
  @FindBy(xpath = "//input[contains(@id, 'donationAmount')]")
  private WebElement donationAmount;

  public void assertOnPage() {
    this.assertTitle("donateMoney.donate_money");
  }

  public void setDonation(Donation donation) {
    // TODO: This used to be `Locale.GERMAN`, change back if OS language is set to German.
    NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.ENGLISH);
    this.name.sendKeys(donation.getDonorName());
    this.iban.sendKeys(donation.getAccount().getIban());
    this.nameBank.sendKeys(donation.getAccount().getNameOfBank());
    this.donationAmount.sendKeys(numberFormat.format(donation.getAmount()));
  }

  public void doDonation() {
    guardHttp(this.getButtonByLabel("donateMoney.donate")).click();
  }

  public void assertThankYou() {
    this.assertFacesMessages("donateMoney.thank_you");
  }
}
