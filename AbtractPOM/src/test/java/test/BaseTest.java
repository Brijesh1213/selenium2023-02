package test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest { ///create after method before method // and create object of page class
	WebDriver driver;
	public Page page;
	//SoftAssert softassert = new SoftAssert();
	
	//public void BaseTest() {
	//super();
//	}
	
	@BeforeMethod
	@Parameters(value = {"browser"})
	public void setUpTest(String browser) throws InterruptedException {
		 
		if (browser.equals("fireFox")) {
		WebDriverManager.firefoxdriver().setup();// this because of one of the dependencies in pom .xml.... bonigarcia
		driver = new FirefoxDriver();
		}
		else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else {
			System.out.println("no browser Selected");
		}
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);// its for time-bieng
	// for url you can maintain properties too, hardcoded for time save
   
	//now call the constructor of page
	
	page = new Basepage(driver);  //if it second video page = new Page(driver,wait);
	}
	// now we are using BasePage to call the constructore of page clss
	//page class is the parent abstract class so we can call constructor of it via child class
	//child class is Basepage
	//without above line you will get null pointer
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();  }

	
}
