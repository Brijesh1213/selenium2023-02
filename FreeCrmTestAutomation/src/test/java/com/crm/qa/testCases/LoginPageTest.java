package com.crm.qa.testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ActualLoginPage;
import com.crm.qa.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPageTest extends TestBase{
    
	LoginPageTest loginPageTest;
	LoginPage loginpage;
	ActualLoginPage actualLoginPage;
	ExtentReports extent;
	WebDriver driver;
	ExtentTest extentTest;
	
	public LoginPageTest() throws IOException {
		super();
	}
	
	// this is added to create extent report <dependency>
	// <groupId>com.relevantcodes</groupId>
	// <artifactId>extentreports</artifactId>
	// <version>2.41.2</version>
	//</dependency> <--required depndency//@Before test//@afterTest/@aftermethod (Main) / added global variable<----modified
	 
	 
	 public String getScreenshot(WebDriver driver, String ScreenshotName) throws IOException { //method for extent
		 
			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String Destination =  System.getProperty("user.dir") + "/FailedScreenshot"+ ScreenshotName + dateName+ ".png" ;
			FileUtils.copyFile (source, new File (Destination));
			return Destination;
		   // for screen shot u need common.io jar
		 }
	 
	 
	 @BeforeTest ///added for extent
	 public void setExtent() {
		 
		extent = new ExtentReports(System.getProperty("user.dri")+"test-output/Extentreport2/extentreport.html", true);
		extent.addSystemInfo("user", "Brijesh");
		extent.addSystemInfo("environment", "automation ");
	 }
	 
	
	 
	 @AfterTest
	 public void endReport() {
		 extent.flush();
		 extent.close();
	 }
	@BeforeMethod
	public void SetUp() throws IOException {
		initialisation();
		loginpage = new LoginPage();
		
	}
	
	@Test(priority =1)
	public void VerifyPageTitleTest() {
		String title= loginpage.VerifyPageTitle();
		Assert.assertEquals(title, "#1 Free CRM customer relationship management software cloud");
	}
	
	@Test (priority=2)
	public void VerifyLogoImageTest() {
	boolean flag = 	loginpage.VerifyLogoImage();
	Assert.assertTrue(flag);
	}
	
	@Test (priority=3)
	public void ClickLoginButtonTest() throws IOException {
	actualLoginPage=loginpage.ClickLoginButton();
	}
	
	@AfterMethod
	public void teardown(ITestResult Result) {
		
		
		if(Result.getStatus()== ITestResult.FAILURE) {
			  //failure is defined as 2
			  extentTest.log(LogStatus.FAIL, "Test Case Failed Is" + Result.getName());
			  extentTest.log(LogStatus.FAIL, "Test Case Failed Is" + Result.getThrowable());
			  
			//  String screenshotPath = loginPageTest.getScreenshot(driver, null);
			 // extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath));;
		  } 
		  
		  else if (Result.getStatus()==ITestResult.SKIP) {
			  extentTest.log(LogStatus.SKIP, "test case skipped is"+ Result.getName());
		  }
		  extent.endTest(extentTest); //ending the test
		  //above method need to be added for ur screenshot and for html report.
		driver.close();
	}
	

}
