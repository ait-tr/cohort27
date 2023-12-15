package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    //precondition: user should be log out
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isLoginLinkPresent()) {
            clickOnSignOutButton();
        }
    }

    @Test
    public void registerExistedUserNegativeTest() {

        clickOnLoginLink();
        fillLoginRegisterForm("manuel@gm.com", "Manuel1234$");
        clickOnRegisterButton();

        Assert.assertTrue(isAlertAppears());
    }

}
