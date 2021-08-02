package com.testnganotationspractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppStoreClass {
  @Test
  public void SearchForGoogleAppStore() {
	  System.out.println("SearchForGoogleAppStore");
  }
  
  @Test
  public void SearchForApp() {
	  System.out.println("SearchForApp");
	
  }
  
  @Test
  public void OpenTheApp() {
	  System.out.println("OpenTheApp");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("sign in");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("sign out");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("open test application");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("close test application");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("open Chrome");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("close Chrome");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Chrome - Set Up System Property");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Chrome - Set Up System Property");
  }

}
