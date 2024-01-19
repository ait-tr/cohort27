package com.phonebook.tests;

import com.phonebook.fw.ApplicationManager;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.*;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", Browser.CHROME.browserName()));

    //@BeforeMethod
    @BeforeSuite
    public void setUp() {
        app.init();
        //     System.out.println("Before suite");
    }

//    @BeforeTest
//    public void beforeTest() {
//        System.out.println("Before test");
//    }
//
//    @AfterTest
//    public void afterTest() {
//        System.out.println("After test");
//    }

    //@AfterMethod
    @AfterSuite(enabled = true)
    public void tearDown() {
        app.stop();
        //   System.out.println("After suite");
    }

}
