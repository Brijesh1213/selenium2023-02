package scripts;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
	

public class ExampleIndiaMart {

	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
			
		
			DesiredCapabilities caps =new DesiredCapabilities();
			
			caps.setCapability("automationName", "Appium");
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "12");
			caps.setCapability("deviceName", "emulator-5554");
			caps.setCapability("uiautomator2ServerInstallTimeout", "80000");
			caps.setCapability("app", "C:\\selenium\\APKs for Appium\\Utest.apk");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			AndroidDriver driver = new AndroidDriver(url,caps);
			Thread.sleep(3000);
		    //driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Email Address']")).sendKeys("bbtvision@gmail.com");.....1
			// u can also use as below
			driver.findElementByAccessibilityId("Email Address").sendKeys("Visionofbbt@gmail.com");
		   // driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Password']")).sendKeys("Test@2");.........1
			//// u can also use as below
			driver.findElementByAccessibilityId("Password").sendKeys("Lalo@12345");
		    //driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Log In button button']")).click();........1
		// u can also use as below
			driver.findElementByAccessibilityId("Log In button button").click();
			Thread.sleep(3000);
			driver.findElementByAccessibilityId("Continue").click();
			Thread.sleep(3000);
			driver.findElementByAccessibilityId("GOT IT").click();
			Thread.sleep(3000);
			driver.findElementByAccessibilityId("Profile, tab, 3 of 3").click();
			
		
				}
	}
	

