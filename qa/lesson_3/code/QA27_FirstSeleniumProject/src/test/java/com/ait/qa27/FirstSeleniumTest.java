package com.ait.qa27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

    //before  - setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        //  driver.get("https://www.google.com"); // without history
        driver.navigate().to("https://www.google.com");//with history
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    //test
    @Test
    public void openGoogleTest() {
        System.out.println("Site opened!");
    }

    //after - tearDown
    @AfterMethod(enabled = false)
    public void tearDown() {
        // driver.quit();//close browser ak all tabs
        driver.close();// only one tab(if tan only one -> close browser)
    }
}
