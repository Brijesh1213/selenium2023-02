import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//https://www.youtube.com/watch?v=g3r5KK2Acx8
//https://www.youtube.com/watch?v=DFvuORfibac// we can use base page methods and create methods for login page, add locators. susch as get element etc
public class Loginpage extends Basepage{
	// beauty is everything is encapsulated
	// page locator, used by only "BY"...created private , personal for class
	//it shows encapsulation private to public by getter and setter
	private By emailId  = By.name("email") ;
	private By password = By.name("pass");
	private By loginButton = By.name("login");
	private By header = By.className("fb_logo _8ilh img");
	//private By header1 = By.xpath("//tag[@attri='atri val']");
    
	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	
//-------below are the getter & setter(removed), getter modified to call private to public
	
	//public void setEmailId(By emailId) {
	//	this.emailId = emailId; }///this how getter looks than modify
	

	public WebElement getEmailId() {
		return getElement(emailId) ;  }

	public WebElement getPassword() {
		return getElement(password) ;  }

	public WebElement getLoginButton() {
		return getElement(loginButton) ;  }

	public WebElement getHeader() {
		return getElement(header) ;  }

	//--------now methods------
	public String  getLoginPageTitle() {
		return getTitle();  ///this getTitle is in Base page class. 
	}
	
	public void getLoginPageHeader() {
	getPageHeader(header);// will use method from page/base class and takes element header from current class
	}
	
	public HomePage doLogin( String userName , String password) {
		
	getEmailId().sendKeys(userName); // get email is same class method for element///note above we passed header here we can not use emailId .sendkey as its nott passing
	getPassword().sendKeys(password);// get pass word is method in this class for element
	getLoginButton().click(); //its the same in class
	
	return getInstance (HomePage.class); //this will help to return to different page
	}
	
	// now method overloading, we will do the same above method with out emailid and password
	
	
	public void doLogin() { // not passing any string// not needed get instance 
		
		getEmailId().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click(); 
	    }
	
	//overloading again 
public void doLogin(String UserCred) { // lets add email but no password 
	//userName : bbtvision@gmail.com
	if(UserCred.contains("userName")) {
		getEmailId().sendKeys(UserCred.split(":")[1].trim());
	}
	else if (UserCred.contains("password")){
		getPassword().sendKeys(UserCred.split(":")[1].trim());
		getLoginButton().click();
	    }
	getLoginButton().click();
	
}	
}
