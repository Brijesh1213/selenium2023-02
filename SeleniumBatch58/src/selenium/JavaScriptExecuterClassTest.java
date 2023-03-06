package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
	Thread.sleep(3000);
		JavascriptExecutor JsE =(JavascriptExecutor) driver;
		WebElement careers = driver.findElement(By.linkText("Careers"));
		//option 1 by co-ordinates
		//System.out.println(careers.getLocation());
		//JsE.executeScript("window.scrollBy ( 0, 3825)");
		//careers.click();
		
		//option 2 : scroll down until careers is true
		JsE.executeScript("arguments[0].scrollIntoView(true);", careers);
		careers.click();
		
		//option 3: direct click no need to scroll
		//JsE.executeScript("arguments[0].click();", careers);
	}

}
