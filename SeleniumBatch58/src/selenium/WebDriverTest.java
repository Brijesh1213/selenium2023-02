package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe\\");
		//FirefoxDriver driver=new FirefoxDriver();
		// ParentClass(interface) driver = new FirefoxDriver();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("bbtvision@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Lalo@123456");
		driver.findElement(By.name("login")).click();
	}

}
