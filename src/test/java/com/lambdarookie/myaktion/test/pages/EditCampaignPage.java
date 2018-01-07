package com.lambdarookie.myaktion.test.pages;

import static org.jboss.arquillian.graphene.Graphene.guardHttp;

import com.lambdarookie.myaktion.model.Campaign;
import org.jboss.arquillian.graphene.page.Location;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Location("editCampaign.jsf")
public class EditCampaignPage extends AbstractPage {
  @FindBy(xpath = "//input[contains(@id, 'a_name')]")
  private WebElement campaignName;
  @FindBy(xpath = "//input[contains(@id, 'a_targetAmount')]")
  private WebElement targetAmount;
  @FindBy(xpath = "//input[contains(@id, 'a_donationMinimum')]")
  private WebElement donationMinimum;

  @FindBy(xpath = "//input[contains(@id, 'b_name')]")
  private WebElement accountName;
  @FindBy(xpath = "//input[contains(@id, 'b_iban')]")
  private WebElement iban;
  @FindBy(xpath = "//input[contains(@id, 'b_name_bank')]")
  private WebElement nameBank;

  public void setCampaign(Campaign campaign) {
    this.campaignName.sendKeys(campaign.getName());
    this.targetAmount.sendKeys(campaign.getTargetAmount().toString());
    this.donationMinimum.sendKeys(campaign.getDonationMinimum().toString());
    this.getTabButtonByLabel("editCampaign.bank_account").click();
    this.accountName.sendKeys(campaign.getAccount().getName());
    this.iban.sendKeys(campaign.getAccount().getIban());
    this.nameBank.sendKeys(campaign.getAccount().getNameOfBank());
  }

  public void doSave() {
    guardHttp(this.getButtonByLabel("editCampaign.save")).click();
  }

  public void assertOnPage() {
    this.assertTitle("editCampaign.add_new_campaign");
  }
}
