package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe\\");
		FirefoxDriver  driver=new FirefoxDriver();
		
		driver.get("https://www.nike.com/ca/");
		Thread.sleep(1000);
		WebElement P = driver.findElement(By.linkText("Men"));
		Actions N = new Actions(driver);
		N.moveToElement(P).build().perform();
		//WebElement Main = driver.findElement(By.xpath("//div[@class='pre-columns-container ncss-row']"));
	//	List<WebElement> K = driver.findElements(By.xpath("(//div[@class='pre-columns-container ncss-row']/div)[7]/a"));
		//List<WebElement> K = Main.findElements(By.xpath("(//div[@class='pre-menu-column pt4-sm ta-sm-l va-sm-t ncss-col-sm-2'])[7]/a"));
		List<WebElement> K = driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Men, Shoes')]"));
		System.out.println(K.size());
		for( WebElement O:K) {
			System.out.println(O.getText());
			
		}
	}

}
