package com.lambdarookie.myaktion.test.pages;

import static org.junit.Assert.assertEquals;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Locale;
import java.util.ResourceBundle;

public abstract class AbstractPage {
  @Drone
  private WebDriver browser;
  @FindBy(xpath = "//h1")
  private WebElement title;
  @FindBy(xpath = "//span[@class='ui-messages-info-summary']")
  private WebElement facesMessages;

  private String getString(String key) {
    return ResourceBundle
        // TODO: This used to be `Locale.GERMAN`, change back if OS language is set to German.
        .getBundle("messages", Locale.ENGLISH)
        .getString(key);
  }

  protected void assertTitle(String key) {
    assertEquals(this.getString(key), this.title.getText());
  }

  protected void assertFacesMessages(String key) {
    assertEquals(this.getString(key), this.facesMessages.getText());
  }

  protected WebElement getButtonByLabel(String label) {
    return this.browser.findElement(By.xpath("//button/span[text()='" + this.getString(label) + "']"));
  }

  protected WebElement getTabButtonByLabel(String label) {
    return this.browser.findElement(By.xpath("//li/a[text()='" + this.getString(label) + "']"));
  }
}
