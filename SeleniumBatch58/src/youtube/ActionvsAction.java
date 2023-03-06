package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionvsAction {
 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
		  driver=new ChromeDriver();
		  driver.get("http://automationpractice.com/index.php");
		  driver.manage().window().maximize();
         WebElement feature= driver.findElement(By.xpath("//a[@title='Women']"));
         Actions act = new Actions(driver);
        // act.moveToElement(feature).perform();
        // act.moveToElement(feature).build().perform();
        Action act1 = act.moveToElement(feature).build(); 
        //Action is interface..here build will return action and we are storing action without performing it in act1
        act1.perform();
	}

}
