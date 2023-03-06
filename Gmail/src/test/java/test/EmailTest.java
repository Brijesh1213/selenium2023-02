package test;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.HomePage;
import page.LoginPage;
import page.Page;

public class EmailTest extends BaseTest {
	
	@Test (dataProvider = "emails")
	public void sendingEmails(String email) throws AWTException  {
		
		
		page.getInstance(LoginPage.class).landOnHomePage();
		
		page.getInstance(HomePage.class).sendingEmails(email);
		
		
		
	}
    public static String getLinkUrl(WebDriver driver, String linkText) {
        List<WebElement> list = driver.findElements(By.xpath("a"));
        String y="";
        for(WebElement x : list){
            
           if(x.getText().equals(linkText)){
               
                y = x.getAttribute("href");
           } 
           else {
        	   return null;
           }
            
           
        } return y;
    }
	
	
}
