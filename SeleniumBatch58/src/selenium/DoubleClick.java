package selenium;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
		
		//======right click============
	/*	System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait  wait = new WebDriverWait(driver,20);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions Builder = new Actions (driver);
		
		Builder.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Copy']")).click();
	
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
		driver.close();   */
		
		//=================double click=================
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver1.get("https://api.jquery.com/dblclick/");
//		JavascriptExecutor jse = (JavascriptExecutor) driver1;
//		jse.executeScript("window.scrollBy(6000,60000)");
		driver1.switchTo().frame(0);
	//	System.out.println(driver1.findElement(By.xpath("//html[@lang='en']/body[1]/div[1]")).getLocation());
		
		Thread.sleep(2000);
		Actions Builder1 = new Actions (driver1);
		
		Builder1.doubleClick(driver1.findElement(By.xpath("//html[@lang='en']/body[1]/div[1]"))).perform();
		
	

		//driver1.close();	
	}

}
