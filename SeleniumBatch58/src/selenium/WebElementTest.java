package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		/*WebElement email=driver.findElement(By.name("email"));
		WebElement Pass = driver.findElement(By.name("pass"));
		WebElement Login = driver.findElement(By.name("login"));
		
		
		 email.sendKeys("fehvbe");
		 Pass.sendKeys("wiobwbri");
	     Login.click()*/
		
		//driver.findElement(By.xpath("//input[contains(@id,'ail')]")).sendKeys("duibuibb");
        //driver.findElement(By.xpath("//input[starts-with(@type,'pass')]")).sendKeys("bvfdbd");
         driver.findElement(By.xpath("//*[text()='Connect with friends and the world around you on Facebook.']"));
	}

}
