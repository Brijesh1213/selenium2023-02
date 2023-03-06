package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Page {
	
	
	
	WebDriver driver;
	
	public Page(WebDriver driver) {
		this.driver=driver;
	}

	public abstract WebElement getElement(By locator);
	
	public abstract String getTitle();
	public abstract String getPageHeader(By locator);

	public<Tpage extends BasePage> Tpage getinstance(Class<Tpage> pageClass) {
		try {
		return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		
	}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	
	}
}
