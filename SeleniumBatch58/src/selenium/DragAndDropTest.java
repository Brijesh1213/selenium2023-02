package selenium;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait  wait = new WebDriverWait(driver,20);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement G = driver.findElement(By.id("draggable"));
		WebElement P = driver.findElement(By.id("droppable"));
		
		Actions Builder = new Actions (driver);
		Builder.dragAndDrop(G, P).build().perform();
		//String K ="Dropped!";
		//String Z = driver.findElement(By.xpath("//div[@id='droppable']/p[1]")).getText();
		wait.until(ExpectedConditions.textToBePresentInElement(P, "Dropped!"));
		if (P.getText().equals("Dropped!")) {
			System.out.println("pass");
		}else {System.out.println("fail");
		}		
		
	}

}
