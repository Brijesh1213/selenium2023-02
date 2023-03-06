package com.crm.qa.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ActualLoginPage;
import com.crm.qa.pages.LoginPage;

public class ActualLoginPageTest extends TestBase{
    LoginPage loginpage;
    ActualLoginPage Apage;
	public ActualLoginPageTest() throws IOException {
		super();
		
	}

	
	@BeforeMethod 
	public void SetUp() throws IOException {
	initialisation();
	loginpage = new LoginPage();
	Apage= new ActualLoginPage();
	loginpage.ClickLoginButton();
	}
	
	@Test
	public void VerifyEmailAddress() throws IOException{
    Apage.TypeEmail();
    Apage.TypePassword();
    Apage.clickLoginButton(); 
	}
  //  @AfterMethod
    public void TearWindow() {
    driver.close();
    }
	}

