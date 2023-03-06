package pages;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationClass extends BaseClass{

	
	
	public  RegistrationClass(){
	    super();
		PageFactory.initElements(driver, this); 
		
	}	

	@FindBy(xpath="//div[@class='_6ltg']/a")
	public WebElement clickbtn;
		
	@FindBy(xpath="//input[@name='firstname']")	
	public WebElement firstname;
	
	
	@FindBy(xpath="//input[@name='lastname']")
	public WebElement lastname;
	
	
	@FindBy(xpath="//input[@name='reg_email__']")
	public WebElement email;
	
	
	@FindBy(xpath= "//input[@name='reg_passwd__']")
	public WebElement password;
	
	@FindBy(xpath="//select[@id='month']")
	public WebElement month;
	
	
	public void getClickbtn() {
		clickbtn.click();
	}
	
	public void getFirstname() {
		firstname.sendKeys(prop.getProperty("firstname"));;
		
	}
	
	public void getLastname() {
		lastname.sendKeys(prop.getProperty("lastname"));;
	}
	
	public void getEmail() {
	     email.sendKeys(prop.getProperty("email"));;
	    
	} 
	
	public void getPassword() {
		 password.sendKeys(prop.getProperty("password"));;
	}
	
	public void getMonth() {
	SelectClass(month);
	sn.selectByValue(prop.getProperty("month"));
	    	
	}
	
	public void inspectMonth() {
	month.getAttribute("value");
	 
	}

	
	}

	
		
	

