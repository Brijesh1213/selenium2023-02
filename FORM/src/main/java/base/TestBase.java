package base;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.TestUtil;



public class TestBase { // create class
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties prop; // chose globally so you can use it in all methods such as initialisation. 
	
	public TestBase(WebDriver driver, WebDriverWait wait) throws IOException { //create constructor with same name// execute properties file
		this.driver = driver;
		this.wait=wait;
		prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\Selenium_Workspace\\SeleniumForm\\src\\main\\resources\\config\\config.properties");
		prop.load(ip);	
		PageFactory.initElements(driver, this);
		
	}

    
    public  void initialisation() throws IOException { // driver initialisation
    	
    	String browser = prop.getProperty("browser");
    	
    	if (browser.equalsIgnoreCase("FireFox")) {
    		
    	WebDriverManager.firefoxdriver().setup();
        driver =new FirefoxDriver(); 
        }
    	else if (browser.equals("Chrome")) {
    		WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	}
    	
    //	PageFactory.initElements(driver, this);
		
    	//maximize. page time out, delete cookies, implicit wait.
    	driver.manage().window().maximize();
    	//driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Time_Out, TimeUnit.SECONDS);
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait, TimeUnit.SECONDS);
    	
    	//
    	
    	
    	driver.get((prop.getProperty("url")));
    	JavascriptExecutor jse =  (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy (625, 4000)");
    	driver.findElement(By.xpath("//footer[@id='footer']/div/div/div[2]/div/p/a[1]")).click();
    	jse.executeScript("window.scrollBy (-625, -4000)");
    
    	//driver.findElement(By.id("banner-accept")).click();
    	
    	
    }
    	public void tearDown() {
    		driver.quit();
    	}
    }
