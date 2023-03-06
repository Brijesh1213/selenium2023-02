package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookFooteerLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe\\");
		FirefoxDriver  driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement Footer= driver.findElement(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']"));
		
		List<WebElement> FooterLinks = Footer.findElements(By.tagName("a"));
		System.out.println(FooterLinks.size());
		System.out.println(FooterLinks.get(0).getText());
		
		for(int i=0; i<FooterLinks.size(); i++) {
			System.out.println(FooterLinks.get(i).getText());
		}
		
	}

}
