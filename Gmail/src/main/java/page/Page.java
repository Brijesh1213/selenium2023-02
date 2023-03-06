package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	WebDriver driver;
	WebDriverWait wait;
	public Page(WebDriver driver) {
		this.driver=driver;
		this.wait= new WebDriverWait(driver,10);
		
	}
	
	public abstract WebElement getElement(By locator);
	
	public abstract String getTitle();
	public abstract String getHeader(By locator);
	
	public  <Tpage extends BasePage> Tpage getInstance(Class<Tpage> pageClass) {
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
