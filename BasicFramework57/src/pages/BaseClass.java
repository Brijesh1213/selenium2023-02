package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver ;
	 
	public static  Properties prop; 
	
	public static Select sn;
	
	public void initialization() throws IOException{
		
		FileInputStream ip = new FileInputStream("C:\\Selenium_Workspace\\BasicFramework57\\config.properties"); 
		prop = new Properties();
		prop.load(ip);
		
		String browsername = prop.getProperty("browser");
		
	    if(browsername.equals("chrome")) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Seleniumjars\\chromedriver.exe\\");
	    driver = new ChromeDriver();
	    }
	    else{
	    	System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe\\");	
	    	driver = new FirefoxDriver();
	    	
	    }
	   
	
	    
	    String url = prop.getProperty("url");         //driver.get(prop.getProperty("url"));
	    driver.get(url);
			   
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  //  driver.manage().deleteAllCookies();
	 //   driver.manage().timeouts().pageLoadTimeout(40, (TimeUnit.SECONDS));
	    
	}
	    public void SelectClass(WebElement w) {
	    	
	       sn = new Select(w);
	      
	      
	       
	    }
	    //driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	}

