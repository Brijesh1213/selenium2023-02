package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/");
		
	//	if(driver.findElement(By.linkText("about")).isDisplayed()){
		//	System.out.println("element Present");                /// u can not check element present via this method as Webdriver will respond Unable to locate for Else ressult
	//	}else {System.out.println("elementNot Present");}        ///IF we are finding element, it has to be present.
		List<WebElement> List = driver.findElements(By.linkText("about"));
		System.out.println(List.size());
		if (List.size()>0) {
			System.out.println("pass");  ///so use list to check element presence
		}else {
			System.out.println("fail");
		}
	}
	}
