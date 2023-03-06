package tests;

import org.testng.annotations.Test;

import data.DataFile;
import pages.LoginPage;
import utilities.Xls_Reader;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	 WebDriver driver;
	LoginPage lp =new LoginPage();
	
	DataFile df = new DataFile();
	
 @BeforeMethod
  public void beforeMethod() throws InterruptedException, IOException {
	  lp.OpenBrowser();
	  lp.OpenLoginUrl();
  }

  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	 
	  lp.CloseBrowser();
	   }


  @Test (priority=1)
 public void LoginWithWrongEmailAndPassword () throws InterruptedException { 
	  
	  
	lp.Login(df.WrongEmail, df.WrongPassword);
		
		String DisplayErr= df.globalErr;
	String ActualErr= lp.readGlobalError();
		
		//Assert.assertEquals(ActualErr, DisplayErr);
		
		}
	@Test(priority=2)
		  public void LoginWithEmptyEmail () throws InterruptedException {
		 lp.Login("", df.WrongPassword);
		 		String DisplayErr= df.EmptyEmailErr;
		 		String ActualErr= lp.readError();
		 		Assert.assertEquals(ActualErr, DisplayErr);
		 		}
	
	@Test(priority=3)
	  public void LoginWithEmptyPassword () throws InterruptedException { 
		  lp.Login(df.WrongEmail, "");
	 		
	 		String DisplayErr= df.EmptyPasswordErr;
	 		String ActualErr= lp.readError();
	 		Assert.assertEquals(ActualErr, DisplayErr);
	 		}
	
	@Test(priority=4)
	  public void LoginWithEmailWithSpecialCharacter () throws InterruptedException {
		 lp.Login(df.EmailWithSpecialChar,df. WrongPassword);
	 		
	 		String DisplayErr= df.EmailWithSpecialCharErr;
	 		String ActualErr= lp.readError();
	 		Assert.assertEquals(ActualErr, DisplayErr);
	 		}
  }

