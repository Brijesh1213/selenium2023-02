package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe\\");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		 driver.findElement(By.linkText("Create New Account")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("lastname")).sendKeys("Patel");
		 driver.findElement(By.name("reg_email__")).sendKeys("9056547856");
		driver.findElement(By.name("reg_passwd__")).sendKeys("kjveoebeirei");

		//select july
		WebElement Month= driver.findElement(By.id("month"));
		Select S =new Select(Month);
		S.selectByValue("7");
		//select 10
		WebElement Date= driver.findElement(By.id("day"));
		Select X =new Select(Date);
		X.selectByValue("10");
		//select 2000
		WebElement Year= driver.findElement(By.id("year"));
		Select Z =new Select(Year);
		Z.selectByValue("2000");
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='sex' and @value='-1']")).click();
		driver.findElement(By.name("websubmit")).click();
    
	}

	}

