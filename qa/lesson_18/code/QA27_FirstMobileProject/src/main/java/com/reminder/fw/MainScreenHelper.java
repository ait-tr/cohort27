package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MainScreenHelper extends com.remindly.fw.BaseHelper {

    public MainScreenHelper(AppiumDriver driver) {
        super(driver);
    }

    public void confirm() {
        tap(By.id("android:id/button1"));
    }

    public boolean isMainScreenTextPresent() {
        return isElementPresent(By.id("no_reminder_text"));
    }

    public void tapOnAddReminder() {
        tap(By.id("add_reminder"));
    }

    public String isReminderTitlePresent() {
        String text = driver.findElement(By.id("recycle_title")).getText();
        return text;
    }
}
