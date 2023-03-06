package com.crm.qa.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ActualLoginPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePagetest extends TestBase {

	HomePage homepage;
	LoginPage loginpage;
    ActualLoginPage Apage;
	public HomePagetest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void SetUp() throws IOException {
	
	initialisation();
	loginpage = new LoginPage();
	Apage= new ActualLoginPage();
	homepage = new HomePage();
	loginpage.ClickLoginButton();
	 Apage.TypeEmail();
	 Apage.TypePassword();
     Apage.clickLoginButton(); 
	
	}

	@Test
	public void verifyPageTitileTest() {
	String title= homepage.VerifyPageTitle();
	Assert.assertEquals(title, "Cogmento CRM");
		
	}
	@Test
    public void verifylogoImageTest() {
	boolean flag = homepage.VerifyLogo();
	Assert.assertTrue(flag);
	}
    
    @Test
    public void VerifyUserDisplayNameTest() {
    String Displayname = homepage.verifyUserDisplayName();
    Assert.assertEquals(Displayname, "brijesh trivedi");
    }
    
    
   
    
    
    @AfterMethod
    public void TearDown(){
    driver.close();
    	
    }
}
