package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsPage extends BasePage{

    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tabButton")
    WebElement tabButton;

    public BrowserWindowsPage switchToNextTab(int index) {
        clickWithJS(tabButton,0,100);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }

    @FindBy(id = "sampleHeading")
    WebElement sampleHeading;

    public BrowserWindowsPage verifyTextFromNewTab(String text) {
        Assert.assertTrue(shouldHaveText(sampleHeading,text,10));
        return this;
    }

}
