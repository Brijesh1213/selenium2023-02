package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testData.DatFile;

public class BasePage extends Page {
	public DatFile file = new DatFile();
	public BasePage(WebDriver driver) {
		super(driver);
		
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			return element;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("there is error fining this locator"+ locator);
		
		}
		return element;
	}

	@Override
	public String getTitle() {
		return driver.getTitle();
	}

	@Override
	public String getHeader(By locator) {
		return getElement(locator).getText();
	}

}
