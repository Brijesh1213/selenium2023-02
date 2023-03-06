package selenium;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jQuery {
    WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe\\");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
        List<WebElement> choices = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
        //selectchoices(choices, "choice 1");
        //selectchoices(choices, "choice 1", "choice 2", "choice 2 1", "choice 2 3");
        selectchoices(choices, "ALL");

        
	}
	
	public static void selectchoices(List<WebElement> List , String...value) {
	
		if(!value[0].equalsIgnoreCase("all")) 
		{
			for(WebElement W : List) {
			for(int i=0; i<=value.length-1; i++) {
				if(W.getText().equals(value[i])) {
					W.click();
				}
			}
				
			}
			
		}
//		else {
//			for(WebElement W: List) {
//				W.click();
//				if(W.getText().equals("choice 7")) {
//					break;
//				}
		else {
		try {
		
			for(WebElement W: List) {
				W.click();
				if(W.getText().equals("choice 7")) {
					break;
				                                    }
		                             } 
			}
		catch(Exception e) {
			System.out.println("First dropdown selection completed");
		}
		
	        }
		}}
//
//String Y;
