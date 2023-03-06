package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class ContactsPage extends TestBase {
    TestUtil testutil ;
	public ContactsPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
   
	@FindBy(className="ui loader")
	WebElement Contactslabel;
	
	@FindBy(name="first_name")
	WebElement Firstname;
	
	@FindBy(name="last_name")
	WebElement Lastname;
	
	public WebElement selectContacts(int i){
	return driver.findElement(By.xpath("//div[@class='ui fitted read-only checkbox']"));
	}
	public void VerifyContactsName(int i){
	driver.findElement(By.xpath("//div[@class='table-wrapper']/table/tbody/tr["+i+"]/td[2]"));
	}
	
	public void AddingContact(String fstname, String lstname) {
		Firstname.sendKeys( fstname);
		Lastname.sendKeys(lstname);		
	}
}
