package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsersTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		FileInputStream f = new FileInputStream("C:\\testing\\BrowserTest.properties");
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
			
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("bbtvision@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Lalo@1234");
		driver.findElement(By.name("login")).click();
	}

}
