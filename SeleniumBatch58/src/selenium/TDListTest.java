package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe\\");
		FirefoxDriver  driver=new FirefoxDriver();
		
		driver.get("https://www.td.com/ca/en/personal-banking/");
		WebElement Header= driver.findElement(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']"));
		
		List<WebElement> HeaderLinks = Header.findElements(By.tagName("a"));
		System.out.println(HeaderLinks.size());
		System.out.println(HeaderLinks.get(0).getText());
		
		//for(int i=0; i<HeaderLinks.size(); i++) {
			//System.out.println(HeaderLinks.get(i).getText());
		for (WebElement W : HeaderLinks) {
			System.out.println(W.getText());
	}
		System.out.println("---------------");
		driver.get("https://www.td.com/ca/en/personal-banking/");
		
		List<WebElement> foot = driver.findElements(By.xpath("//div[@class='td-row']/div[1]/div[2]/a"));
		System.out.println(foot.size());
		for(WebElement d:foot) {
			System.out.println(d.getText());
		}
		
	}

}
