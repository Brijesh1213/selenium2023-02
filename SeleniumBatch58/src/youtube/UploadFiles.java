package youtube;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Upload Resume')]")).click();
		
		//if you have type attribute equal File..than u can use send keys method
		//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Selenium_Workspace\\SeleniumBatch58\\Download\\file-sample_100kB.doc");
		
		//RobotClass
		WebElement button= driver.findElement(By.xpath("//input[@id='file-upload']"));
		JavascriptExecutor js = driver;
		js.executeScript("arguments[0].click();", button);
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss= new StringSelection("C:\\Selenium_Workspace\\SeleniumBatch58\\Download\\file-sample_100kB.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
