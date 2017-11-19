package com.lambdarookie.myaktion.model;

import java.util.List;

public class Campaign {
  private String name;
  private Double targetAmount;
  private Double donationMinimum;
  private Double amountDonatedSoFar;
  private Account account;
  private Long id;
  private List<Donation> donations;

  public Campaign() {
    this.account = new Account();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getTargetAmount() {
    return this.targetAmount;
  }

  public void setTargetAmount(Double targetAmount) {
    this.targetAmount = targetAmount;
  }

  public Double getDonationMinimum() {
    return this.donationMinimum;
  }

  public void setDonationMinimum(Double donationMinimum) {
    this.donationMinimum = donationMinimum;
  }

  public Double getAmountDonatedSoFar() {
    return this.amountDonatedSoFar;
  }

  public void setAmountDonatedSoFar(Double amountDonatedSoFar) {
    this.amountDonatedSoFar = amountDonatedSoFar;
  }

  public Account getAccount() {
    return this.account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public List<Donation> getDonations() {
    return this.donations;
  }

  public void setDonations(List<Donation> donations) {
    this.donations = donations;
  }
}
