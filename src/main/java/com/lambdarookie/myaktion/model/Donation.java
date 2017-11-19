package com.lambdarookie.myaktion.model;

public class Donation {
  private Double amount;
  private String donorName;
  private Boolean receiptRequested;
  private Status status;
  private Account account;

  public enum Status {
    TRANSFERRED,
    IN_PROCESS
  }

  public Donation() {
    this.account = new Account();
  }

  public Double getAmount() {
    return this.amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public String getDonorName() {
    return this.donorName;
  }

  public void setDonorName(String donorName) {
    this.donorName = donorName;
  }

  public Boolean getReceiptRequested() {
    return this.receiptRequested;
  }

  public void setReceiptRequested(Boolean receiptRequested) {
    this.receiptRequested = receiptRequested;
  }

  public Status getStatus() {
    return this.status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Account getAccount() {
    return this.account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }
}
