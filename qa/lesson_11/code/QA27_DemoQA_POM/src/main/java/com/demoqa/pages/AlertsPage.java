package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

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

    @FindBy(id = "timerAlertButton")
    WebElement timerAlertButton;

    public AlertsPage clickByAlertWithTimer() {
        clickWithJS(timerAlertButton,0,100);

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.alertIsPresent()).accept();
        return this;
    }

    @FindBy(id = "confirmButton")
    WebElement confirmButton;

    public AlertsPage selectResult(String confirm) {
        clickWithJS(confirmButton,0,100);

        if (confirm != null && confirm.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        } else if (confirm != null && confirm.equals("OK")) {
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(id = "confirmResult")
    WebElement confirmResult;

    public AlertsPage verifyResult(String result) {
        Assert.assertTrue(confirmResult.getText().contains(result));
        return this;
    }

    @FindBy(id = "promtButton")
    WebElement promtButton;

    public AlertsPage sendMessageToAlert(String message) {
        clickWithJS(promtButton,0,200);

        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(id = "promptResult")
    WebElement promptResult;

    public AlertsPage verifyMessage(String message) {
        Assert.assertTrue(promptResult.getText().contains(message));
        return this;
    }
}
