package com.lambdarookie.myaktion.test;

import com.lambdarookie.myaktion.test.pages.DonateMoneyPage;
import com.lambdarookie.myaktion.test.pages.EditDonationFormPage;
import com.lambdarookie.myaktion.test.pages.ListCampaignsPage;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.InitialPage;
import org.jboss.arquillian.graphene.page.Page;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Arquillian.class)
public class DonateMoneyITCase extends AbstractITCase {
  @Drone
  private WebDriver browser;
  @Page
  private EditDonationFormPage editDonationFormPage;
  @Page
  private DonateMoneyPage donateMoneyPage;

  @Before
  public void setupDatabase() {
    SetupDatabase.addCampaign(DataFactory.createTestCampaign());
  }

  @Test
  public void testDonateMoney(@InitialPage ListCampaignsPage listCampaignsPage) {
    listCampaignsPage.clickCampaignUrl();
    this.editDonationFormPage.assertOnPage();
    this.browser.get(this.editDonationFormPage.getFormUrl());
    this.donateMoneyPage.assertOnPage();
    this.donateMoneyPage.setDonation(DataFactory.createDonation());
    this.donateMoneyPage.doDonation();
    this.donateMoneyPage.assertThankYou();
  }
}
