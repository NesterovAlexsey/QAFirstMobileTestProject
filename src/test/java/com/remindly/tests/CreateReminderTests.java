package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateReminderTests extends TestBase {

  @Test
  public void addReminderWithDefaultData() {

    int quantityBefore = app.getReminder().getTotalReminders();
    app.getMainScreen().tapOnAddReminder();
    app.getReminder().enterTitle("Test");
    app.getReminder().saveReminder();

    int quantityAfterAdd = app.getReminder().getTotalReminders();
    //assert to add new reminder
    Assert.assertEquals(quantityAfterAdd, quantityBefore + 1);
  }

  @Test
  public void addReminderPositiveTest() {
    app.getMainScreen().tapOnAddReminder();
    app.getReminder().enterTitle("1 September");
    //date
    app.getReminder().selectDate("future", "SEP", 3, 0, "future", "2026");
    //time
    app.getReminder().selectTime("am", 405, 690, 542, 1191);
    //enter repetition interval, id = RepeatNo
    //select type of repetition, id = RepeatType
      //xpath = //*[@text='" + typeRep + "']



//    app.getReminder().saveReminder();
  }
}
