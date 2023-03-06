package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionListtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		driver.findElement(By.name("_nkw")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> List = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(List.size());
		for (WebElement G : List) {
			System.out.println(G.getText());
	}
	}

}
