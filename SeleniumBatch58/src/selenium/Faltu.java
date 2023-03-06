package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Faltu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe\\");
		FirefoxDriver  driver=new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		Thread.sleep(5000);
				List<WebElement> header = driver.findElements(By.xpath("//div[@id='mainContent']/div[1]/ul[1]/li"));
				System.out.println(header.size());
				for (WebElement p: header) {
					System.out.println(p.getText());
				}
	}
				

}
