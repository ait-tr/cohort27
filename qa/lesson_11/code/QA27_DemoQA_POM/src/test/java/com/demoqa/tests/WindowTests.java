package com.demoqa.tests;

import com.demoqa.pages.BrowserWindowsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowTests extends TestBase{

    HomePage homePage;
    SidePanel sidePanel;
    BrowserWindowsPage browserWindowsPage;

    @BeforeMethod
    public void precondition() {
        homePage = new HomePage(driver);
        sidePanel = new SidePanel(driver);
        browserWindowsPage = new BrowserWindowsPage(driver);

        homePage.confirmCookies().getAlertsFrameWindows();
        sidePanel.selectBrowserWindows();
    }

    @Test
    public void switchToNewTabTest() {
        browserWindowsPage.switchToNextTab(1).verifyTextFromNewTab("This is a sample page");
    }
}
