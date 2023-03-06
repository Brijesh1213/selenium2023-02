package selenium;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DropDownAutoComepleteGooglePlaces {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		 ChromeOptions options = new ChromeOptions();
		 HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
		 HashMap<String, Object> profile = new HashMap<String, Object>();
		 HashMap<String, Object> prefs = new HashMap<String, Object>();
		 contentSettings.put("geolocation", 2);
		 profile.put("managed_default_content_settings", contentSettings);
		 prefs.put("profile", profile);
		 options.setExperimentalOption("prefs", prefs);  // above code is just for disableing location browser pop up, this is to ask,allow,block....
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");  // bwlo this line is the another way of disabling the pop up...just for BLOCK
//options.addArguments("disable-geolocation"); //....location browser pop-up
// options.addArguments("disable-notifications");...notification browser pop up
// options.addArguments("disable-media-stream");  ..microphone, camera access browser pop up
//another method.......... 
//chrome or fire fox options have preferences and they have key Value pair..key is string and value is (0,1,2) Ask, Allow,Block
//so we can use HasMap
		 WebDriver  driver=new ChromeDriver(options); // make sure you pass options in this consturctor here to execute written code
				

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		
		
		WebElement x= driver.findElement(By.id("autocomplete"));
		x.click();
		x.clear();
		Thread.sleep(2000);
		SelectFromAutoCompleteDropDown(x,"toronto","Toronto NSW, Australia");
		
	}
	

	public static void SelectFromAutoCompleteDropDown(WebElement X, String Y, String Z) throws InterruptedException {
		
		X.sendKeys(Y);
		Thread.sleep(2000);
		while(!Y.isEmpty()) {
			Thread.sleep(2000);
			X.sendKeys(Keys.ARROW_DOWN);
			Y=X.getAttribute("value");
			if(Y.equals(Z)) {
				X.sendKeys(Keys.ENTER);
				break;
			}
		}
		driver.quit();
		
	}

}
