package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (!isLoginLinkPresent()){
            clickOnSignOutButton();
        }

        clickOnLoginLink();
        fillLoginRegisterForm("manuel@gm.com", "Manuel1234$");
        clickOnLoginButton();

        clickOnAddLink();
        fillAddContactForm("Karl", "Adam", "1234567890",
                "adam@gm.com", "Koblenz", "goalkeeper");
        clickOnSaveButton();
    }

    @Test
    public void removeContactPositiveTest() {
        //get size of contacts before remove
        int sizeBefore = sizeOfContacts();

        removeContact();
        pause(1000);
        //get size of contacts after remove
        int sizeAfter = sizeOfContacts();
        //assert by number of contacts
        Assert.assertEquals(sizeAfter,sizeBefore-1);
    }

}
