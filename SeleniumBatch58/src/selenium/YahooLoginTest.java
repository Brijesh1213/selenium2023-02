package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe\\");
		FirefoxDriver  driver=new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-username")).sendKeys("ibrivebv");
		driver.findElement(By.name("signin")).click();
		Thread.sleep(2000);
		String F= driver.findElement(By.xpath("//p[@data-error='messages.INVALID_USERNAME']")).getText();
		System.out.println(F);
		String H = "Sorry, we don't recognize this email.";
		if(H.equals(F)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	
		
	}

}
