package youtube;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
		  driver=new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/key_presses");
		  driver.manage().window().maximize();
		  Actions act = new Actions(driver);
		  
		  act.sendKeys(Keys.ENTER).perform();
		  Thread.sleep(1000);
		  act.sendKeys(Keys.BACK_SPACE).perform();
		  Thread.sleep(1000);
		  act.sendKeys(Keys.ESCAPE).perform();
		  Thread.sleep(1000);
		  act.sendKeys(Keys.SPACE).perform();
	}

}
