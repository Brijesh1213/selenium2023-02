import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Refernce extends Basepage {

	public Refernce(WebDriver driver) {
		super(driver);
	}

	private By emailId  = By.name("email") ;
	private By password = By.name("pass");
	private By loginButton = By.name("login");
	private By header = By.className("fb_logo _8ilh img");
	
	
	public WebElement getEmailId() {
		return getElement(emailId) ;  }

	public WebElement getPassword() {
		return getElement(password) ;  }

	public WebElement getLoginButton() {
		return getElement(loginButton) ;  }

	public WebElement getHeader() {
		return getElement(header) ;  }
}
