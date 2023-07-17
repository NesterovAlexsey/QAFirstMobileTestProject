package com.remindly.tests;

import com.remindly.fw.AppManager;
import java.net.MalformedURLException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

  protected static AppManager app = new AppManager();

  @BeforeMethod
  public void setUp() throws MalformedURLException {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
