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

public class JavaScriptExecutor {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
		  driver=new ChromeDriver();
		  driver.get("https://demo.nopcommerce.com/");
		  driver.manage().window().maximize();
		  
		  //Syntax, we are creating utility file
//		  JavaScriptExecutor js =(JavaScriptExecutor) driver;
//		  js.executeScript(Script,args);
		  
		  //1.Flash and item
		  WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")); 
		  JavaScriptUtil.flash(logo, driver);
		  //2. draw a border & screnshot
	  //WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		 
//		  JavaScriptUtil.drawBorder(logo, driver);
//		  Thread.sleep(1000);
//		  TakesScreenshot ts= (TakesScreenshot) driver;
//		  File src1 = logo.getScreenshotAs(OutputType.FILE);
//		  FileUtils.copyFile(src1, new File( ".//JSEScreenshot//border1.png"));
		  
		  //3.get title
		 // System.out.println(JavaScriptUtil.getTitle(driver));
		  
		  //4. click action
//		  WebElement register= driver.findElement(By.xpath("//a[@class='ico-register']"));
//		  JavaScriptUtil.clickElement(register, driver);
//		  
		  //5. throw alert
		// JavaScriptUtil.generateAlert("This is register page", driver);
		 
		  //6.refresh
		 // JavaScriptUtil.refreshBrowser(driver);
		  
		  //7.scrolling page
//		  Thread.sleep(1000);
//		  JavaScriptUtil.ScrollDown(driver);
//		  Thread.sleep(1000);
//		  JavaScriptUtil.ScrollUp(driver);
//		  
		  //8.zoom in zoom out
//		  Thread.sleep(1000);
//		  JavaScriptUtil.ZoomInPageBy(driver);
//		  Thread.sleep(1000);
//		  JavaScriptUtil.ZoomOutPageB(driver);
	}

}
