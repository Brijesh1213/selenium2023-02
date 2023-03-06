package tests;


import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testing1 {
	
ExtentReports extent;
WebDriver driver;// nt needed all three we only used listner to create report
ExtentTest extentTest;


 @Test(dataProvider = "dp")
  public void abc(Integer n, String s) {
	
	 System.out.println(n+s);
	 
  }
 

 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void tearDown(ITestResult Result) throws IOException {
	  
	  
	  driver.quit();
	  System.out.println("afterMethod");
  }


  @DataProvider
  public Object[][] dp() {
	 
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }

  @AfterTest(groups = {"smoke"})
  public void afterTest() {
	  System.out.println("afterTest");
  }

  @BeforeSuite 
  public void beforeSuite() {
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");
  }
  @Test(groups = {"smoke"})
  public void Test1() {
	  System.out.println("Test1");
  }
  @Test(groups = {"smoke"})
  public void Test2() {
	  System.out.println("Test2");
  }
  @Test (groups = {"smoke"})
  public void Test3() {
	  System.out.println("Test3");
  }

}

