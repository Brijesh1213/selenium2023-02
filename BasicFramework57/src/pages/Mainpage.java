package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import data.DataFile;

public class Mainpage extends BaseClass {
	

   DataFile d = new DataFile();
   
		public  Mainpage(){
		    super();
			PageFactory.initElements(driver, this); 
			
		}	

		@FindBy(xpath="//div[@class='_6ltg']/a")
		public WebElement clickbtn;
	
		
		
		public RegistrationClass getClickbtn() {
			clickbtn.click();
			return new RegistrationClass();
		}
		
		
		



}
