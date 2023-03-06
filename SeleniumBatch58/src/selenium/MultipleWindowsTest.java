package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe\\");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("https://www.adidas.ca/en");
		Thread.sleep(4000);
		
		
		driver.findElement(By.linkText("also visit")).click();
		Thread.sleep(2000);
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows.size());
		//allwindows = driver.getWindowHandles();
	
		Iterator<String> Itr= allwindows.iterator();
		String mainWindow = Itr.next();
		String childWindow = Itr.next();
		System.out.println(mainWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}