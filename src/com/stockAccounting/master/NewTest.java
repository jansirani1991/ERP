package com.stockAccounting.master;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class NewTest {
	stocklib SL=new stocklib();
  @BeforeTest
  public void beforeTest() {
	  SL.Admlgn("admin","master");
  }

  @AfterTest
  public void afterTest() {
	  SL.Logout();
  }

  @BeforeSuite
  public void beforeSuite() throws IOException {
	  SL.openApp("http://webapp.qedgetech.com");
  }

  @AfterSuite
  public void afterSuite() {
	  SL.closeApp();
  }

}
