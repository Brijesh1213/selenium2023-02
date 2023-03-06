package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class EmulatorExample2 {
	
public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		//https://appium.io/docs/en/writing-running-appium/caps/  (below are general capabilities)
		// automationName : Appium (default name)
		//platformName:iOS, Android, or FirefoxOS
		//platformVersion : I0s or android Version 
		//deviceName: name of device or name of emulator.  R38M306B2RW this is my device name cmd>adb devices, given that device is connected via USB
		//Emulator: is a virtual device. w can get it from android studio, saucelab.
		//app : it will be apk file or ipa for android
		
		// automationName : Appium
		//platformName :Android
		//platformVersion :12 
		//deviceName :R38M306B2RW
		//app : C:\selenium\APKs for Appium\IndiaMart.apk
		//now create object (caps) of DC and use Object(caps) to set capabilities in form of string and object.
		// now as per androiid documentation we need two things
		//1 desired capabilities  & URL for appium server =http://127.0.0.1:4273/wd/hub...this is the url
		
		DesiredCapabilities caps =new DesiredCapabilities();
		
		caps.setCapability("automationName", "Appium");
		caps.setCapability("platformName", "Android");
		
		caps.setCapability("platformVersion", "12");
		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("app", "C:\\selenium\\APKs for Appium\\zip.apk");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,caps);
			//driver.findElement(By.className("android.widget.Button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.ziprecruiter.android.release:id/emailButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.ziprecruiter.android.release:id/skipButton")).click();
	    //driver.quit();
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='My Jobs']")).click();
}
}