//Xls_Reader f = new Xls_Reader("C:\\testing\\BrowserTestExcel.xlsx");
		
		//String browser = f.getCellData("Sheet1", 0, 1);
package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTestExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		Xls_Reader f = new Xls_Reader("C:\\testing\\BrowserTest.xlsx");
		String browser = f.getCellData("Sheet1", 0, 3);
		
	
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
