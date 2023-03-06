package com.crm.qa.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ActualLoginPage;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{
    LoginPage loginpage;
    ActualLoginPage Apage;
    HomePage homepage;
    ContactsPage contactpage;
    TestUtil testutil;
	public ContactsPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void SetUp() throws IOException {
		initialisation();
		loginpage = new LoginPage();
		Apage= new ActualLoginPage();
		homepage = new HomePage();
		contactpage= new ContactsPage();
		loginpage.ClickLoginButton();
		 Apage.TypeEmail();
		 Apage.TypePassword();
	     Apage.clickLoginButton();
	     homepage.VerifyContactsPage();
	}
	
	//@DataProvider///// need your help
	public Object[][] getCRMdata() {
		Object[][] data = testutil.getData();
		return data;
		}
	    
	   
	
	
	@Test
	public void verifySlectcontactTest() {
	WebElement header = driver.findElement(By.id("top-header-menu"));
	Actions Builder = new Actions(driver);
	Builder.moveToElement(header).build().perform();
	//contactpage.selectContacts(1).click();
	boolean flag = contactpage.selectContacts(1).isDisplayed();
	Assert.assertTrue(flag);
	}
	
	
	//@Test (dataProvider = "getCRMdata")// need your help
	public void VerifyContactAddedtest(String fname, String Lname) throws IOException {
	homepage.VerifyNewContactsadded();
	
	contactpage.AddingContact(fname, Lname);
	}
	
	@AfterMethod
	public void tearDown() {
	driver.close();
	}
	
	

}
