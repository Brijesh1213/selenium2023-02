package parallel.ParallelBrowser;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	WebDriver driver;



   @Parameters(value={"browser"})
    @BeforeMethod
    
    public void initialisation(String browser)
    {  
    	if(browser.equalsIgnoreCase("Firefox")) {
    	
    		WebDriverManager.firefoxdriver().setup();
    		driver = new FirefoxDriver();
    	    driver.get("http://seleniumtraining.guber.me/"); }
    	
    	else if(browser.equalsIgnoreCase("Chrome")) {
    		WebDriverManager.chromedriver().setup();
    		driver = new ChromeDriver();
    	    driver.get("http://seleniumtraining.guber.me/");
    	}
    }
    @AfterMethod
    public void tearDown() {
    	driver.close();
    }

}

