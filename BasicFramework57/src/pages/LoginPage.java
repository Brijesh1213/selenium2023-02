package pages;
import utilities.Xls_Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	//Object
	
	WebDriver driver;
	/*WebElement email =  driver.findElement(By.name("usernameInput"));
	WebElement password =driver.findElement(By.id("password-input")); 
	WebElement SignIn =driver.findElement(By.className("ButtonCore__block"));
	WebElement globalerr = driver.findElement(By.id("globalError"));
	WebElement readErr= driver.findElement(By.className("Error__text"));*/
	
	@FindBy (name= "usernameInput")
	public WebElement emailbox;
	
	@FindBy (id= "password-input")
	public WebElement passwordBox;
	
	@FindBy (className= "ButtonCore__block")
	public WebElement loginButton;
	
	@FindBy (id= "globalError")
	public WebElement globalError;
	
	@FindBy (className= "Error__text")
	public WebElement generalError;
	
	
	public void OpenBrowser() throws IOException {
		FileInputStream f = new FileInputStream("C:\\testing\\BrowserTestProperties.properties");
		Properties p = new Properties();
		p.load(f);
		String browser = p.getProperty("browser");
	
		//String browser = "Chrome";
		
		
			if (browser.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe\\");
		 driver =new FirefoxDriver(); }
			else if (browser.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver.exe\\");
			 driver=new ChromeDriver();
			}
			PageFactory.initElements(driver, this);
			}
    public void OpenLoginUrl() throws InterruptedException {
    	driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=ETy1xfij_EU&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiRVR5MXhmaWpfRVUiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTYzMzUyNzY0NCwiaWF0IjoxNjMzNTI2NDQ0LCJqdGkiOiIwYTZhNzZmOS1jNWY3LTRlMjAtYTQyZi02MThkYmRkMjVjMjciLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.vGTGz-NiE12ji_haHz2M3sTpbCT-aoNm4ZNp595yKAR8KYmuJ9-Kws27zanmuq0unUNEWddlSJqrcTNGAsTh7ELW4EDw0Sz6l7b1AXQ3as-KeH8S5eh1KwG8jB8INmp5sXmq2bkXWPSwymIC8qC48dRkbE-MMhmqD1HeAUr1kjZwWSDfGhAh0_8jqi9nWv3V6i_kxwCdzZI5qgyrFQf6RqnGnR2OUx3zwVzrgjvDLYWvVKR6OPWGMACPHpwhJhX6o1ZCZtpTGTnTVlSdLFqsl8kkmPJV60A1RZ-nQ__WG5L50hnyehX1Wvc9C5Yl5NJHK-tcb8j9DVXCW5JzBGnJ2Q&preferred_environment=");
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	Thread.sleep(3000);
    }
    public void CloseBrowser() throws InterruptedException {
    	  Thread.sleep(2000);
    	  driver.quit();
    }
    public void Login(String a, String b) throws InterruptedException {
    	emailbox.sendKeys(a);
 		passwordBox.sendKeys(b);
 		loginButton.click();
 		Thread.sleep(3000);
    }
    
    
    public String readGlobalError() {
    	String ActualErr=globalError.getText();
		System.out.println(ActualErr);
		return ActualErr;
    }
    public String readError() {
    	String ActualErr= generalError.getText();
 		System.out.println(ActualErr);
		return ActualErr;
    }
    
}
