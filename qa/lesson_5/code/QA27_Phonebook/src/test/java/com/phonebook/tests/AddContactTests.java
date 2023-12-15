package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {

        if (!isLoginLinkPresent()){
            clickOnSignOutButton();
        }

        clickOnLoginLink();
        fillLoginRegisterForm("manuel@gm.com", "Manuel1234$");
        clickOnLoginButton();
    }

    @Test
    public void addContactPositiveTest() {
        clickOnAddLink();

        fillAddContactForm("Karl", "Adam", "1234567890",
                "adam@gm.com", "Koblenz", "goalkeeper");
        //click on save button
        clickOnSaveButton();
        //assert by name of contact
        Assert.assertTrue(isContactCreatedByText("Karl"));
    }

}
