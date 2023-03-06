package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ChromeDriverTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver.exe\\");
		ChromeDriver  driver=new ChromeDriver();
		
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
