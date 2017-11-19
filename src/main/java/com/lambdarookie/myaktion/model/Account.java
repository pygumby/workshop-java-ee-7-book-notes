package com.lambdarookie.myaktion.model;

public class Account {
  private String name;
  private String nameOfBank;
  private String iban;

  public Account() {
    this(null, null, null);
  }

  public Account(String name, String nameOfBank, String iban) {
    super();
    this.name = name;
    this.nameOfBank = nameOfBank;
    this.iban = iban;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNameOfBank() {
    return this.nameOfBank;
  }

  public void setNameOfBank(String nameOfBank) {
    this.nameOfBank = nameOfBank;
  }

  public String getIban() {
    return this.iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }
}
