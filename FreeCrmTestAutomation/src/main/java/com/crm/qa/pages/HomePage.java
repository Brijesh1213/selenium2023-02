package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='main-nav']/div[3]")
	WebElement Contacts ;
	
	@FindBy(className="money icon")
	WebElement Deals;
	
	@FindBy (xpath="//th[text()='Address']")
	WebElement ContactAddress;
	
	@FindBy (xpath="//span[@class='trial-indicator']")
	WebElement PinLogo;
	
	@FindBy (xpath = "//span[contains(text(),'brijesh trivedi')]")
	WebElement userdisplayname;
	
	@FindBy (className="ui mini basic icon button")
	WebElement AddContact;
	
	public ContactsPage VerifyContactsPage() throws IOException {
	//Actions Builder = new Actions(driver);
	//Builder.moveToElement(Contacts).build().perform();
	Contacts.click();
	return new ContactsPage();
	
	}
	
	public DealsPage VerifyDealsPage() throws IOException {
	Deals.click();
	return new DealsPage();
	}
	
	public boolean VerifyLogo() {
	return PinLogo.isDisplayed();
	}
	
	public String VerifyPageTitle() {
	return driver.getTitle();
	}
	
	public String verifyUserDisplayName() {
	return userdisplayname.getText();
	}
	
	public ContactsPage VerifyNewContactsadded() throws IOException {
		Actions Builder = new Actions(driver);
		Builder.moveToElement(Contacts).build().perform();
		AddContact.click();
		return new ContactsPage();
	 }
  
}
