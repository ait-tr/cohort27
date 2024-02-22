package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SelectPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).confirmCookies().getWidgets();
        new SidePanel(driver).getSelect();
    }

    @Test
    public void selectOldStyleTest() {
        new SelectPage(driver).selectOldStyle("Blue");
    }

    @Test
    public void multiSelectTest() {
        new SelectPage(driver).multiSelect(new String[]{"Red","Green","Blue"});
    }

    @Test
    public void standardMultiSelectTest() {
        new SelectPage(driver).standardMultiSelect(2);
    }
}
