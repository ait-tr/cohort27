package com.reminder.fw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReminderHelper extends BaseHelper {

    public ReminderHelper(AppiumDriver driver) {
        super(driver);
    }

    public void enterReminderTitle(String title) {
        type(By.id("reminder_title"), title);
    }

    public void tapOnDataField() {
        tap(By.id("date"));
    }

    public void swipeToMonth(String period, int number, String month) {
        pause(500);

        if (!getSelectedMonth().equals(month)) {
            for (int i = 0; i < number; i++) {
                if (period.equals("future")) {
                    swipe(0.8, 0.4);
                } else if (period.equals("past")) {
                    swipe(0.5, 0.8);
                }
            }
        }
    }

    public void swipe(double startPoint, double stopPoint) {
        Dimension size = driver.manage().window().getSize();

        int x = size.width / 2;

        int startY = (int) (size.height * startPoint);
        int stopY = (int) (size.height * stopPoint);

        new TouchAction((PerformsTouchActions) driver).longPress(PointOption.point(x, startY))
                .moveTo(PointOption.point(x, stopY))
                .release().perform();
    }

    public String getSelectedMonth() {
        return driver.findElement(By.id("date_picker_month")).getText();
    }

    public void tapOnDate(int index) {
        List<WebElement> days = driver.findElements(By.className("android.view.View"));
        days.get(index).click();
    }

    public void selectYear(String period2, String year) {
        pause(500);
        if (!getSelectedYear().equals(year)) {
            tap(By.id("date_picker_year"));
            if (period2.equals("future")) {
                swipeUntilNeededYear(year, 0.6, 0.5);
            } else if (period2.equals("past")) {
                swipeUntilNeededYear(year, 0.5, 0.6);
            }
        }

        tap(By.id("month_text_view"));
    }

    public String getSelectedYear() {
        return driver.findElement(By.id("date_picker_year")).getText();
    }

    public void swipeUntilNeededYear(String year, double startPoint, double stopPoint) {
        while (!getYear().equals(year)) {
            moveInElement(By.className("android.widget.ListView"), startPoint, stopPoint);
        }
        getYear();
    }

    public void moveInElement(By locator, double startPoint, double stopPoint) {
        Dimension size = driver.manage().window().getSize();
        //get activity point
        int y = (int) (size.height * startPoint);
        int y2 = (int) (size.height * stopPoint);

        //get Locator's point
        WebElement element = driver.findElement(locator);
        int leftX = element.getLocation().getX();
        int rightX = leftX + element.getSize().getWidth();
        int middleX = (leftX + rightX) / 2;

        new TouchAction((PerformsTouchActions) driver).longPress(PointOption.point(middleX, y))
                .moveTo(PointOption.point(middleX, y2))
                .release().perform();
    }

    public String getYear() {
        return driver.findElement(By.id("month_text_view")).getText();
    }

    public void tapOnOk() {
        tap(By.id("ok"));
    }
}
