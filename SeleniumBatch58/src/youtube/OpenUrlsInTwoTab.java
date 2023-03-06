package youtube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class OpenUrlsInTwoTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
		ChromeDriver driver=new ChromeDriver();
		  driver.get("https://demo.nopcommerce.com/");
		//  driver.switchTo().newWindow(WindowType.TAB);..this will open in new tab
		//  driver.switchTo().newWindow(WindowType.Window);..this will open in new window
		  
		  ///AbtractPOM/src/main/java/OpenUrlinNewTab.java..........check this project path..issue in this with selenium
		  driver.get("https://www.opencart.com/");
		  driver.manage().window().maximize();

	}

}
