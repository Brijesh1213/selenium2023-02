package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		/*String H = driver.findElement(By.linkText("Sortable")).getText();
		String Y = "Sortable";
		System.out.println(H);
		if (H.equals(Y)) {
			System.out.println("pass");
		}else { System.out.println("fail");*/
		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if (sortable.size()>0) {System.out.println("sortable present");
		}else {System.out.println("sortable not present");}
		
		List<WebElement> draggable = driver.findElements(By.xpath("//div[@id='draggable']/p"));
		System.out.println(draggable.size());
		if (draggable.size()>0) {System.out.println("draggable present");
		}else {System.out.println("draggable not present");}
		// Switch to frame
		
		driver.switchTo().frame(0);// as this is first frame
		//driver.switchTo().frame("here there is no id or name"); // if u have id or name
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		System.out.println("-------------after switching to frame--------------");
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if (sortable.size()>0) {System.out.println("sortable present");
		}else {System.out.println("sortable not present");}
	
		draggable = driver.findElements(By.xpath("//div[@id='draggable']/p"));
		System.out.println(draggable.size());
		if (draggable.size()>0) {System.out.println("draggable present");
		}else {System.out.println("draggable not present");}
		System.out.println("-----------back to main page--------");
		
		driver.switchTo().defaultContent();
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if (sortable.size()>0) {System.out.println("sortable present");
		}else {System.out.println("sortable not present");}
	
		draggable = driver.findElements(By.xpath("//div[@id='draggable']/p"));
		System.out.println(draggable.size());
		if (draggable.size()>0) {System.out.println("draggable present");
		}else {System.out.println("draggable not present");}
		//driver.switchTo.parentFrame();-----to go to previous (parent) frame....b to d
		}

}
