package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedioButtonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		List<WebElement> a = driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(a.size());	
		for (WebElement p:a) {
			
			System.out.println(p.getAttribute("value")+"----"+p.isSelected() );
			}
		Thread.sleep(1000);
		a.get(0).click();
		System.out.println("=========after Selection==========");
for (WebElement p:a) {
			
			System.out.println(p.getAttribute("value")+"----"+p.isSelected() );
			}
			
		}
	
	}

