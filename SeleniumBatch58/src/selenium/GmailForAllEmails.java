package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailForAllEmails {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
	 FileInputStream f =new FileInputStream ("C:\\testing\\prop.properties");
	 Properties x = new Properties();
	 x.load(f);
	 System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		WebDriverWait X = new WebDriverWait(driver,20);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
	 
		}

	}

