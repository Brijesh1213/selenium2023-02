package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//wrong email inspect line poped up
		
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		WebDriverWait X = new WebDriverWait(driver,20);
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		Thread.sleep(2000);
	//	X.until(ExpectedConditions.titleContains("Google"));
		String k = driver.getTitle();
		System.out.println(k);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("identifierId")).sendKeys("hjehbvrervrov");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		
		String h= driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		String a = "Couldn't find your Google Account";
		System.out.println(h);
		if (h.equals(a)) {
			System.out.println("pass");
			
		}else {
			System.out.println("fail");
		}
		
		
	}

}
