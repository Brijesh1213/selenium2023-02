package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ActualLoginPage extends TestBase {

	public ActualLoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath="//input[@name='email']")
	WebElement EmailBox;
	

	@FindBy(name="password")
	WebElement PasswordBox;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement LoginButton;
	
	
     public void TypeEmail() {
	 EmailBox.sendKeys(prop.getProperty("username"));
	
     }
     
	 public void TypePassword() {
	 PasswordBox.sendKeys(prop.getProperty("password"));
	 }
     public HomePage clickLoginButton() throws IOException {
     LoginButton.click();
     return new HomePage();
    	 
     }
	}
