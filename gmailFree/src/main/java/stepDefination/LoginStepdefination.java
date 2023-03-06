package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepdefination {
	
	WebDriver driver ;
	

	@Given("^User is already on Login Page$")
	public void user_already_On_loginPage() {
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe\\");
		driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
				}
			
			@When("^title of login page is Gmail$")
			public void Login_Title() {
				String title = driver.getTitle();
				System.out.println(title);
				Assert.assertEquals("Facebook - Log In or Sign Up", title);
			}
			
			@Then ("^User Enter UserName And User Click on Next*")
			public void add_userName_ClickNext() {
				WebElement UserName = driver.findElement(By.id("email"));
				UserName.sendKeys("bbtvision@gmail.com");
			}
			@Then ("^User Enter Password And User click on Next*")
			public void add_Password_ClickNext() {
				WebElement UserName = driver.findElement(By.id("pass"));
				UserName.sendKeys("Lalo@123456");
				WebElement login =driver.findElement(By.name("login"));
				login.click();
				
			}
			@Then("^User is on Home page$")
			public void user_is_on_Home_page()  {
			WebElement Compose = driver.findElement(By.className("p361ku9c"));
			boolean flag = Compose.isDisplayed();
			Assert.assertTrue(flag);	
			    
			}
	
	
	
	
	
	
	
	
	
	
}
