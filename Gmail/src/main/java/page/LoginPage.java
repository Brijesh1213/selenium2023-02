package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class LoginPage extends BasePage{
	

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	private By email =By.xpath( "//*[@id='i0116']");
	private By next = By.xpath( "//*[@id='idSIButton9']");
	private By password = By.xpath( "//input[@aria-label='Enter the password for visionofbbt@outlook.com']");
	private By signIn = By.xpath( "//input[@value='Sign in']");
	private By yes = By.className( "inline-block");
	public WebElement getEmail() {
		return getElement(email);
	}
	public WebElement getNext() {
		return getElement(next);
	}
	public WebElement getPassword() {
		return getElement(password);
	}
	public WebElement getYes() {
		return getElement(yes);
	}
	public WebElement getSignIn() {
		return getElement(signIn);
	}
	public HomePage landOnHomePage() {
		//getEmail().click();
		//((JavascriptExecutor) driver).executeScript(file.emailID, getEmail());
		wait.until(ExpectedConditions.visibilityOf(getEmail()));
		getEmail().sendKeys(file.emailID);
		wait.until(ExpectedConditions.visibilityOf(getNext()));
		getNext().click();
		wait.until(ExpectedConditions.elementToBeClickable(getPassword()));
		getPassword().sendKeys(file.passwordID);
		wait.until(ExpectedConditions.visibilityOf(getSignIn()));
		getSignIn().click();
		wait.until(ExpectedConditions.visibilityOf(getYes()));
		getYes().click();
		return new HomePage(driver);
	}
	
}
