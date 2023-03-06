package selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class ExplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*WebDriverWait wait = new WebDriverWait(driver,20);
		
		
		driver.findElement(By.name("B2")).click();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert P = driver.switchTo().alert();
		P.accept();*/
		// this below is for fluent wait
		Wait wait = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		/*WebElement foo = wait.until(new Function() {    
		    public WebElement apply(WebDriver driver) {    
		        return driver.findElement(By.id("foo"));    
		    }
		});*/
		
		
		
	}

}
