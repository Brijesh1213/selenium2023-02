package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe\\");
		FirefoxDriver  driver=new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		WebElement Header= driver.findElement(By.xpath("//ul[@class='hl-cat-nav__container']"));
		
		List<WebElement> HeaderLinks = Header.findElements(By.tagName("a"));
		System.out.println(HeaderLinks.size());
		System.out.println(HeaderLinks.get(0).getText());
		
		for(int i=0; i<HeaderLinks.size(); i++) {
			System.out.println(HeaderLinks.get(i).getText());
	}

}
}
