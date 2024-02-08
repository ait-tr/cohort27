package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage{

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "alertButton")
    WebElement alertButton;

    public AlertsPage acceptAlert() {
        click(alertButton);
        driver.switchTo().alert().accept();
        return this;
    }
}
