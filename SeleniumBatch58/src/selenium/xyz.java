package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xyz {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe\\");
	   FirefoxDriver driver = new FirefoxDriver();
				
		driver.get("https://www.facebook.com/");
		Thread.sleep(6000);
		
        driver.findElement(By.name("email")).sendKeys("fehvbe");
		String h =  driver.findElement(By.name("email")).getText();
		System.out.println(h);
		

	}

}