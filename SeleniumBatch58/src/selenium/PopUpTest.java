package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		List<WebElement> p = driver.findElements(By.className("btn-close"));
		List<WebElement> q = driver.findElements(By.className("_24EHh"));
		System.out.println(p.size());
		System.out.println(q.size());
		if (p.size()==1) { 
			driver.findElement(By.className("btn-close")).click();
		} 
		if (q.size()==1) {
			driver.findElement(By.className("_24EHh")).click();
		} //else {driver.findElement(By.className("search-key")).sendKeys("computer");}
		driver.findElement(By.className("search-key")).sendKeys("computer");
		
		// remove pop upse and search computer
		// if no pop up ups run and search computer
	}

}
