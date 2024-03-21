package com.reminder.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddReminderTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        app.getMainScreen().confirm();
    }

    @Test
    public void addReminderPositiveTest() {
        //tap on add reminder
        app.getMainScreen().tapOnAddReminder();
       //enter title
        app.getReminder().enterReminderTitle("Holiday");
        //select date
        app.getReminder().tapOnDataField();
        app.getReminder().swipeToMonth("future",2,"MAY");
        app.getReminder().tapOnDate(0);
        app.getReminder().selectYear("future","2025");
        app.getReminder().tapOnOk();
        //select time
        app.getReminder().tapOnTimeField();
        app.getReminder().selectTime("am",535,1195,535,653);
        //add repetition interval
        app.getReminder().defineRepetition("2");
        //swipe up
        app.getReminder().swipe(0.8,0.4);
        //select type of repetitions
        app.getReminder().selectTypeOfRepetition("Week");
        //assert reminder is added by text
        Assert.assertTrue(app.getMainScreen().isReminderTitlePresent("Holiday"));
    }
}
