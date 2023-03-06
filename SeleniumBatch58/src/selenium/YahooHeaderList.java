package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe\\");
		FirefoxDriver  driver=new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		WebElement Header= driver.findElement(By.xpath("//ul[@class='_yb_1m71c _yb_fbw7v']"));
		
		List<WebElement> HeaderLinks = Header.findElements(By.tagName("a"));
		System.out.println(HeaderLinks.size());
		System.out.println(HeaderLinks.get(0).getText());
		
		for(int i=0; i<HeaderLinks.size(); i++) {
			System.out.println(HeaderLinks.get(i).getText());
	}
		System.out.println("--------");
		
         List<WebElement> Sider= driver.findElements(By.xpath("//li[@class='trending-list']/ul/li"));
		System.out.println(Sider.size());
		for (WebElement a: Sider) {
			System.out.println(a.getText());
	

}
}
}