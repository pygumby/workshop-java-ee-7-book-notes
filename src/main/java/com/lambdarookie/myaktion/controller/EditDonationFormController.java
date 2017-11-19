package com.lambdarookie.myaktion.controller;

import com.lambdarookie.myaktion.data.CampaignProducer;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

@SessionScoped
@Named
public class EditDonationFormController implements Serializable {
  private static final long serialVersionUID = -4210085664588144340L;

  private String textColor = "000000";
  private String bgColor = "ffffff";
  @Inject
  private CampaignProducer campaignProducer;

  private String getAppUrl() {
    HttpServletRequest req = (HttpServletRequest) FacesContext
        .getCurrentInstance()
        .getExternalContext()
        .getRequest();
    String scheme = req.getScheme();
    String serverName = req.getServerName();
    int serverPort = req.getServerPort();
    String contextPath = req.getContextPath();
    return scheme + "://" + serverName + ":" + serverPort + contextPath;
  }

  public String doOk() {
    return Pages.LIST_CAMPAIGNS;
  }

  public String getUrl() {
    return this.getAppUrl() + "/" + Pages.DONATE_MONEY + ".jsf?" +
        "bgColor=" + this.bgColor +
        "&textColor=" + this.textColor +
        "&campaignId=" + this.campaignProducer.getSelectedCampaign().getId();
  }

  public String getTextColor() {
    return this.textColor;
  }

  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }

  public String getBgColor() {
    return this.bgColor;
  }

  public void setBgColor(String bgColor) {
    this.bgColor = bgColor;
  }
}
