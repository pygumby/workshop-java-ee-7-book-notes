package com.lambdarookie.myaktion.test;

import com.lambdarookie.myaktion.model.Campaign;
import com.lambdarookie.myaktion.test.pages.EditCampaignPage;
import com.lambdarookie.myaktion.test.pages.ListCampaignsPage;
import org.jboss.arquillian.graphene.Graphene;

public class SetupDatabase {
  public static void addCampaign(final Campaign campaign) {
    final EditCampaignPage editCampaignPage = Graphene.goTo(EditCampaignPage.class);
    final ListCampaignsPage listCampaignsPage = Graphene.goTo(ListCampaignsPage.class);

    listCampaignsPage.doAddCampaign();
    editCampaignPage.assertOnPage();
    editCampaignPage.setCampaign(campaign);
    editCampaignPage.doSave();
  }
}
