package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe\\");
		FirefoxDriver  driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		//WebElement firstlink= driver.findElement(By.tagName("a"));
	
		
		List<WebElement> AllLinks= driver.findElements(By.tagName("a"));
		
	System.out.println(AllLinks.get(0).getText());
	System.out.println(AllLinks.size());
	for (int i=0; i<AllLinks.size();i++) {
		System.out.println(AllLinks.get(i).getText());
		/*WebElement footer= driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));//change div to find left side only
		List<WebElement> footer1= footer.findElements(By.tagName("a"));
		System.out.println(footer1.size());
	System.out.println(footer1.get(0).getText());
	for (int i1=0; i1<footer1.size();i1++) {
		System.out.println(footer1.get(i1).getText());
		
		
	}*/
				
	}

	}
}
