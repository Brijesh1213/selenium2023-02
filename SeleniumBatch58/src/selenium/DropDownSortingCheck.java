package selenium;

import java.util.ArrayList;import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownSortingCheck {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		driver.findElement(By.xpath("(//div[@class='cuSelect'])[1]")).click();
		CheckIfDorpdownIsSortedOrNot(driver);

	}
	
	public static void CheckIfDorpdownIsSortedOrNot(WebDriver driver) {
		ArrayList original = new ArrayList();
		ArrayList temp = new ArrayList();
		List<WebElement> list = driver.findElements(By.xpath("(//div[@class='cuSelect'])[1]/div/select/option"));
		int flag=0;
		for(WebElement l:list) {
			original.add(l.getText());
			temp.add(l.getText());
		}
		
		Collections.sort(temp);
		//for(int i=0;  i <= original.size()-1; i++ ) {
			if(original.equals(temp)) {
				System.out.println("List is sorted");
			}
			else {
				
				System.out.println("List is not sorted");
				System.out.println(original);
				System.out.println(temp);
			}
			
		
		driver.close();
		
	}
	

}
