import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
//https://www.youtube.com/watch?v=g3r5KK2Acx8
//https://www.youtube.com/watch?v=DFvuORfibac // this will have driver, (others if abstract class) or on normal page just driver and get instance
public abstract class Page {
	
   WebDriver driver;
   WebDriverWait wait;
   
	
	public Page(WebDriver driver){
	 
		this.driver =driver;
		this.wait = new WebDriverWait(this.driver,20);
        }
	
	//abstract methods

	public abstract String getTitle();
	public abstract String getPageHeader(By locator);
	public abstract WebElement getElement ( By locator);
	public abstract void waitforElementPresent ( By locator);
	public abstract void waitForPageTitle (String title);
	
	public <Tpage extends Basepage> Tpage getInstance(Class<Tpage> pageClass) {
		// in get instance method we are passsing a pageClass which has reference of Tpage. Here, this get instance
		//method will return a Tpage which is extended to basepage. now create Base page class
		//this will help to get instance of any class that wee give to it.
		// page.getInstance(Loginpage.class).doLogin()// here, we are calling get instance from page class and using it with passing login page class and calling doLoginmethod()...
		//thi way we do not need to create isntace of the Login page.
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	
	}
}