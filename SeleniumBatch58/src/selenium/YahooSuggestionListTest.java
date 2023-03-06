package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		RemoteWebDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		driver.findElement(By.name("p")).sendKeys("Canada");
		Thread.sleep(2000);
		List<WebElement> List = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(List.size());
		for (WebElement G : List) {
			System.out.println(G.getText());
			
	}

}
}
