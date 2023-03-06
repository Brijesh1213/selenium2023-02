package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoadActictionMultipleKeys {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
		  driver=new ChromeDriver();
		  driver.get("https://text-compare.com/");
		  driver.manage().window().maximize();
		  Actions act = new Actions(driver);
		  WebElement Window1 =driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		  WebElement Window2 =driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		  Window1.sendKeys("Welcome to selenium");
		  //Ctrl+A
		  act.keyDown(Keys.CONTROL);
		  act.sendKeys("a");
		  act.keyUp(Keys.CONTROL);
		  act.perform();
		//Ctrl+C
		  act.keyDown(Keys.CONTROL);
		  act.sendKeys("c");
		  act.keyUp(Keys.CONTROL);
		  act.perform();
		  //TAB
		  act.sendKeys(Keys.TAB);
		  //Ctrl+V
		  act.keyDown(Keys.CONTROL);
		  act.sendKeys("v");
		  act.keyUp(Keys.CONTROL);
		  act.perform();
		 //compare text
		  if(Window1.getAttribute("value").equals(Window2.getAttribute("value"))){
			  System.out.println("text copied");
		  }
		  else {
			  System.out.println("text not copied");
		  }
		  
	}

}
