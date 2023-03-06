package youtube;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class GenericFluentWait {
	static WebDriver driver;
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
	  driver=new ChromeDriver();
	
	
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.name("q")).sendKeys("Selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	
	//usage of the fluent wait
	
	By element = By.xpath("//div[@class='HiHjCd']/a[2]");
	WebElement x = genericMethod(driver, element,30,5 );
	x.click();

}
	public static WebElement genericMethod(WebDriver driver, By locator, int TimeOutSecs, int PollingSecs) {
		//FluentWait declaration
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(TimeOutSecs))
				  .pollingEvery(Duration.ofSeconds(PollingSecs))
				  .ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
			});
		
		return element;
	}
	
}
/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
       .withTimeout(Duration.ofSeconds(30L))
       .pollingEvery(Duration.ofSeconds(5L))
       .ignoring(NoSuchElementException.class);

   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
     public WebElement apply(WebDriver driver) {
       return driver.findElement(By.id("foo"));
     }
   });*/
