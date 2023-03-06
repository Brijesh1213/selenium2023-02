package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownTest {
       
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe\\");
		FirefoxDriver  driver=new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		List<WebElement> DropDown = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(DropDown.size());
		for(WebElement a:DropDown) { 
	    	              // this will print only default or selected text
			if(a.isSelected()) { System.out.println(a.getText()+"......."+a.isSelected());}
	    }
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    System.out.println("----------");
	    
	    WebElement D =driver.findElement(By.id("gh-cat"));
	    Select s =new Select(D);
	    List<WebElement> L = s.getAllSelectedOptions();
    	//System.out.println(L.size());
	    
	    s.selectByIndex(6);
	    Thread.sleep(2000);
	    s.selectByValue("267");
	    Thread.sleep(2000);
	    s.selectByVisibleText("Collectibles");
	    System.out.println(".................");
	    
	    for(WebElement a:DropDown) { 
	    	if(a.isSelected()) {
		    System.out.println(a.getText()+"......."+a.isSelected());}
	    	
	    }
	    
	   driver.close();
		}
	}


