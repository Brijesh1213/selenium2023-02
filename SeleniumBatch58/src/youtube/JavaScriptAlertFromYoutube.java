package youtube;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptAlertFromYoutube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
		ChromeDriver  driver=new ChromeDriver();
		//accept
//      driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
//		driver.switchTo().alert().accept();
		// accept or reject
//      driver.get("https://the-internet.herokuapp.com/javascript_alerts");		
//		driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
		//sendkeys and acccept or cancel
//      driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		WebElement x= driver.findElement(By.xpath("//*[text()='Click for JS Prompt']"));
//		x.click();
//		
//		Alert a= driver.switchTo().alert();
//		System.out.println(a.getText());
//		a.sendKeys("I love My wife");
//		a.accept();
		
		//authentication pop-up
//		driver.get("https://the-internet.herokuapp.com/basic_auth");... this will not work
//		syntax
//		https://admin:admin@the-internet.herokuapp.com/basic_auth....here for this site admin and admin are username password
//		https://username:password@the-internet.herokuapp.com/basic_auth.... change url like this or
//		https://username:password@ URL (basic synatx)
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); // this will login directly
		
		//permission pop-up(Notification pop-up, browser popup)
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-notifications"); //this will disable notifications
		driver.get("");
		
		
		
		
	}

}
