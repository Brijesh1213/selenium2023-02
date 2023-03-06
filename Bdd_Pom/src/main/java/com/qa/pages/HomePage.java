package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@aria-label='Facebook']")
	WebElement logoImage;
	
	public boolean logoimage() {
		boolean flag =logoImage.isDisplayed();
		return flag;
	}
	
	
	
	
	

}
