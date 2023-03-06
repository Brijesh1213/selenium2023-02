package test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xyz {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe\\");
		   FirefoxDriver driver = new FirefoxDriver();
					
			driver.get("https://www.facebook.com/");
			Thread.sleep(6000);
			
	        driver.findElement(By.name("email")).sendKeys("fehvbe");
			driver.findElement(By.name("email")).isDisplayed();
			
			
			
	}

}
