package com.lambdarookie.myaktion.controller;

import com.lambdarookie.myaktion.data.CampaignListProducer;
import com.lambdarookie.myaktion.data.CampaignProducer;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@SessionScoped
@Named
public class EditCampaignController implements Serializable {
  private static final long serialVersionUID = 2815796004558360299L;

  @Inject
  private CampaignListProducer campaignListProducer;
  @Inject
  private CampaignProducer campaignProducer;

  public String doSave() {
    if (campaignProducer.isAddMode()) {
      this.campaignListProducer.getCampaigns().add(this.campaignProducer.getSelectedCampaign());
    }
    return Pages.LIST_CAMPAIGNS;
  }

  public String doCancel() {
    return Pages.LIST_CAMPAIGNS;
  }
}
