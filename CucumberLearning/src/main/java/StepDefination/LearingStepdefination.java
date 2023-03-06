package StepDefination;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given; 
import cucumber.api.java.en.Then; 
import cucumber.api.java.en.When; 

public class LearingStepdefination {

WebDriver driver ;

@Given("^User is already on Login Page*") 
public void user_already_On_loginPage() { 
System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe\\"); 
driver =new FirefoxDriver();
driver.get("https://www.facebook.com/"); }

// \"(.*)\" =  (.*) >  "(.*)"  > \"(.*)\"

@Then ("^User Enter (\\d+) and User click on Next$") 
public void add_userName_ClickNext(int email) { 
	 WebElement UserName =driver.findElement(By.id("email")); 
	 UserName.sendKeys(""+email); 
	 }



@Then ("^User Enter \"(.*)\" User click on Next$")
public void add_Password_ClickNext(String pass) { 
	 WebElement UserName =driver.findElement(By.id("pass")); 
	 UserName.sendKeys(pass); 
	 WebElement login=driver.findElement(By.name("login")); 
	 login.click();

}


@Then("^close the browser$")
public void CloseBrowser() { 
	driver.close();  
}
}



