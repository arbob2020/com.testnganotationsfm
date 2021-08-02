package com.testnganotationspractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BuyTablet {
  @Test
  public void HowMuchDoesTheTabletCost() {
	  System.out.println("HowMuchDoesTheTabletCost");
  }
  
  @Test 
  public void TheTabletCosts1000Dollars() {
	  System.out.println("TheTabletCosts1000Dollars");
  }
  
  @Test
  public void ICanBuyTheTablet() {
	  System.out.println("ICanBuyTheTablet");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Sign in");
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
	  System.out.println("open chrome");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("close chrome");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("chrome - set up system property");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("chrome - set up system property");
  }

}
