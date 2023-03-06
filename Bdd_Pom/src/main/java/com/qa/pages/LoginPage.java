package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy (id="email")
	WebElement username ;
	
	@FindBy (id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement loginButton;
	
	public void enterEmailAndPassword() {
		username.sendKeys(prop.getProperty("Username"));
		password.sendKeys(prop.getProperty("Password"));
	}
	
	public HomePage ClickLogin() throws IOException {
		loginButton.click();
		return new HomePage();
	}
	
	public String title() {
	return 	driver.getTitle();
		
	}
	

}
