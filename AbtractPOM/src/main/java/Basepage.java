import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
//https://www.youtube.com/watch?v=g3r5KK2Acx8
//https://www.youtube.com/watch?v=DFvuORfibac // this will have methods that need on every page 
public class Basepage extends Page{

	public Basepage(WebDriver driver) {
		super(driver);
		
	}
  // overridering the same mathod of parent page class same parameter passed and exact same name.
	//if u pass different parameter in same method name it will be overloading.
	@Override
	public String getTitle() {
		
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
    return getElement(locator).getText(); /// this cud be used too //driver.findElement(locator);
		
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			return element;
		} catch (Exception e) {
			System.out.println("Some err occered while creation of element"+ locator.toString());
		    e.printStackTrace();
		} return element;
	}

	@Override
	public void waitforElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		catch(Exception e) {
			System.out.println("Exception occered while waiting for"+locator.toString());
		}
		
	}

	@Override
	public void waitForPageTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e) {
			System.out.println("Exception occered while waiting for title"+ title);
		}
	}

}
