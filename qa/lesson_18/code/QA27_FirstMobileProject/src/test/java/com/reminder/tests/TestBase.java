package com.reminder.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void init() throws MalformedURLException {
       app.start();
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
       app.stop();
    }
}


