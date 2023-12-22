package com.phonebook.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {

    WebDriver driver;

    UserHelper user;
    ContactHelper contact;
    HomePageHelper homepage;

    public void init() {
        driver = new ChromeDriver();
        driver.get("https://telranedu.web.app");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user = new UserHelper(driver);
        contact = new ContactHelper(driver);
        homepage = new HomePageHelper(driver);
    }

    public UserHelper getUser() {
        return user;
    }

    public ContactHelper getContact() {
        return contact;
    }

    public HomePageHelper getHomepage() {
        return homepage;
    }

    public void stop() {
        driver.quit();
    }

}
