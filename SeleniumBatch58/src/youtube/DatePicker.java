package youtube;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
  static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
		  driver=new ChromeDriver();
		  driver.get("https://www.redbus.in/");
		  driver.findElement(By.id("onward_cal")).click();
		  
		  String Month= "Dec";
		  String Year = "2023";
		  String Date ="20";
		  
          while(true) {
        	  String monthyear=driver.findElement(By.xpath("//tr[@class='rb-monthHeader']/td[2]")).getText();
        	  String my[]= monthyear.split(" ");
        	  String M = my[0];
        	  String Y = my[1];
        	  if(M.equals(Month) && Y.equals(Year)) {
        		  break;
        	  }
        	  else {
        		  driver.findElement(By.xpath("//tr[@class='rb-monthHeader']/td[3]")).click(); 
        	  }
          }
          
//          for(int i=3; i<=8; i++) {
//        	  for(int j=1; j<=7; j++ ) {
//        		 WebElement date= driver.findElement(By.xpath("//tbody//tr["+i+"]//td["+j+"]"));
//        		 if (date.getText().equals(Date)) {
//        			 date.click();
//        			 break;
//        		 }
//        	  }
          
          List<WebElement> Dates = driver.findElements(By.xpath("//tbody//td"));
        	 for(WebElement ele:Dates) {
        		 String dt = ele.getText();
        		 if(dt.equals(Date)) {
        			 ele.click();
        			 break;
        		 }
          }
          
         
	}

}
