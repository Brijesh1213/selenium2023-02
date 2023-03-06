package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	private By email = By.name("email");
	private By password = By.name("pass");
	private By loginButton = By.name("login");
	private By header = By.className("_8e63 _ihd _6s");

	public WebElement getEmail() {
		return getElement(email);
	}
	public WebElement getPassword() {
		return getElement(password);
	}
	
	public WebElement getLoginButton() {
		return getElement(loginButton);
	}
	public WebElement getHeader() {
		return getElement(header);
	}
	//methods
	public String getLoginPageTitle() {
		return getTitle();
	}
	public void getLoginPageHeader() {
		getPageHeader(header);
	}
	public HomePage login(String email , String password) {
		getEmail().sendKeys(email);
		getPassword().sendKeys(password);
		getLoginButton().click();
		return new HomePage();
	}
	

	
	

}
