package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebEventListener;

public class TestBase { // create class
	
	public static WebDriver driver;
	public static Properties prop; // chose globally so you can use it in all methods such as initialisation. 
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	
	public TestBase() throws IOException { //create constructor with same name// execute properties file	
		prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\testing\\config.properties");
		prop.load(ip);	
	}

    
    public static void initialisation() throws IOException { // driver initialisation
    	
    	String browser = prop.getProperty("browser");
    	
    	if (browser.equals("FireFox")) {
    	System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe\\");
        driver =new FirefoxDriver(); }
    	else if (browser.contentEquals("Chrome")) {
    	System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver.exe\\");
    	driver=new ChromeDriver();
    	}
    	
    	e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
    	//maximize. page time out, delete cookies, implicit wait.
    	driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Time_Out, TimeUnit.SECONDS);
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait, TimeUnit.SECONDS);
    	
    	// get your url
    	driver.get(prop.getProperty("url"));
    	
    }
    			
    }
