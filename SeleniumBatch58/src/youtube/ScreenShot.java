package youtube;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub'
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
		  driver=new ChromeDriver();
		  driver.get("https://demo.nopcommerce.com/");
		  driver.manage().window().maximize();
		 
		  //fullpage screenshot
		  // google search classes and interfaces for selenium see hirerarchy, webDrive is interface implemented by class RemoteWebDriver,
		  // you see RemoteWebDriver extened to all browser and also implements JavascriprExecutore and TakesScreenshot
		  
		  
		  TakesScreenshot ts= (TakesScreenshot) driver;
		  //or if u dont want TakeScreenshot instance use ,File src = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		  
          File src =ts.getScreenshotAs(OutputType.FILE);
          File trget = new File(".\\Screenshot\\homepage.png");
          FileUtils.copyFile(src, trget);
          
          // capture the section of the page
          WebElement section =driver.findElement(By.xpath("	//div[@class='product-grid home-page-product-grid']"));
          File src3 =section.getScreenshotAs(OutputType.FILE);
          File trget3 = new File(".\\Screenshot\\featureonpage.png");
          FileUtils.copyFile(src3, trget3);
          
       // capture the webElement of the page
          WebElement ele =driver.findElement(By.xpath("	//img[@alt='nopCommerce demo store']"));
          File src4 =ele.getScreenshotAs(OutputType.FILE);
          File trget4 = new File(".\\Screenshot\\WebElement.png");
          FileUtils.copyFile(src4, trget4);
	}

}
