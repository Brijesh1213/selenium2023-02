package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 // test all attribute on facebook email section
		
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe\\");
	   FirefoxDriver driver = new FirefoxDriver();
				
		driver.get("https://www.facebook.com/");
		String t =driver.getTitle();
		System.out.println(t);
		Thread.sleep(6000);
		// class name- not working
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("vdjbdsv");
		
		//cssselector- we have to learn syntax
		//driver.findElement(By.cssSelector(null))
		
		//id-working
		//driver.findElement(By.id("email")).sendKeys("bsdb");
		
		//LinkText only used for links
		//driver.findElement(By.linkText(null))
		
		//Name-working
        driver.findElement(By.name("email")).sendKeys("fehvbe");
		String h =  driver.findElement(By.name("email")).getText();
		System.out.println(h);
		//PartialLink - Used for links only
		//driver.findElement(By.partialLinkText(null))
		
		// Tag name- its not unique...error Element <input name="jazoest" type="hidden"> is not reachable by keyboard..this happens
		//because check inspect input tag name is there multiple times and error shows the first time it detected input
		//driver.findElement(By.tagName("input")).sendKeys("dvbdkv");
		
		//Xpath- need to learn syntax
		//driver.findElement(By.xpath(null))
		
		//password
     //   driver.findElement(By.name("pass")).sendKeys("wiobwbri");
        //login
     //   driver.findElement(By.tagName("button")).click();
		
		

	}

}
