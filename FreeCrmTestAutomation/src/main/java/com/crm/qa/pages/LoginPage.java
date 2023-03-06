package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	



// provide PageFactory :OR (Object Repository)
@FindBy (xpath="//div[@class='rd-navbar-wrap']/a[1]")
WebElement  LoginButton;

@FindBy (xpath ="//span[text() =' sign up']")
WebElement SignUpbutton;

@FindBy (xpath="(//a[@class='brand-name'])[1]")
WebElement LogoImage;



//Initializing the page object
public LoginPage() throws IOException {
		super();
	PageFactory.initElements(driver, this);
}



// Create methods for actions
public String VerifyPageTitle() {
	return driver.getTitle();
}
public boolean VerifyLogoImage() {
	return LogoImage.isDisplayed();
}
public ActualLoginPage ClickLoginButton() throws IOException{
	LoginButton.click();
	
	return new ActualLoginPage();
}

}