package com.demoqa.tests;

import com.demoqa.pages.AlertsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).confirmCookies().getAlertsFrameWindows();
        new SidePanel(driver).selectAlerts();
    }

    @Test
    public void acceptAlertTest() {
        new AlertsPage(driver).acceptAlert();
    }

    @Test
    public void alertWaitTest() {
        new AlertsPage(driver).clickByAlertWithTimer();
    }

    @Test
    public void selectResultTest() {
        new AlertsPage(driver).selectResult("Cancel").verifyResult("Cancel");
    }

    @Test
    public void sendMessageToAlert() {
        new AlertsPage(driver).sendMessageToAlert("Hello world!!").verifyMessage("Hello world!!");
    }
}
