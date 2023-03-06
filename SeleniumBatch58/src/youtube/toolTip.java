package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
		  driver=new ChromeDriver();
		  driver.get("https://jqueryui.com/tooltip/");
		  driver.manage().window().maximize();
		  driver.switchTo().frame(0);
		  WebElement inputbox= driver.findElement(By.xpath("//input[@id='age']"));
		  String tooltip=inputbox.getAttribute("title");
		  System.out.println(tooltip);
	}

}
