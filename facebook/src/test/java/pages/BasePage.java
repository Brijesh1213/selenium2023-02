package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasePage extends Page {
	
	public  BasePage(WebDriver driver)  {
		super(driver);
		try {
			FileInputStream file = new FileInputStream("C:\\Selenium_Workspace\\facebook\\src\\test\\java\\config\\loginPage.properties");
			Properties prop =new Properties();
			prop.load(file);
		}catch(Exception e){
			System.out.println("There is issue with properties file");
			e.printStackTrace();
		}
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element= driver.findElement(locator);
		return element;
		}catch(Exception e){
			
			System.out.println("there is some err finding webElement"+locator.toString());
			e.printStackTrace();
			
		}
		return element;
	}

	@Override
	public String getTitle() {
	return	driver.getTitle();	
	}

	
	@Override
	public String getPageHeader(By locator) {
    return getElement(locator).getText();	
	}
}
