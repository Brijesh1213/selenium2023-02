package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.HttpConnection;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
		ChromeDriver  driver=new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		ArrayList FListValid = new ArrayList(); // added later
		ArrayList FListBroken = new ArrayList(); //added later
		int TotalBrokenLinks=0;
		int TotalValidLinks=0;
		int TotalNonUrlLinks=0;
		List<WebElement> Links = driver.findElements(By.tagName("A"));
		System.out.println("This are total Links: "+Links.size());
		for(WebElement Link:Links) {
			
			String url=Link.getAttribute("href");
			
			
			if(url==null || url.isEmpty()) {
				
				System.out.println("This Url is Empty");
				continue;
			}
			try {
			URL link =new URL(url);
			HttpURLConnection httpConn = (HttpURLConnection)link.openConnection();
			
			if(httpConn.getResponseCode()>=400) {
				FListBroken.add(httpConn.getResponseCode()+" "+url+" This URL is Broken"); //added later
				//System.out.println(httpConn.getResponseCode()+" "+url+" This URL is Broken");
				TotalBrokenLinks++;
			}
			
			
			else {
				FListValid.add(httpConn.getResponseCode()+" "+url+" This Url is Valid"); //added later
				//System.out.println(httpConn.getResponseCode()+" "+url+" This Url is Valid");
				TotalValidLinks++;
			}
			}
			catch(Exception e) {
				//e.printStackTrace();
			System.out.println(url +"this are not Urls");
			TotalNonUrlLinks++;
			}
		}
		
		System.out.println("Total Non Url Links :"+TotalNonUrlLinks);
		Collections.sort(FListBroken);                  //added later
		Collections.sort(FListValid);                  //added later
		
		for(int i=0; i<=FListBroken.size()-1;i++) {     //added later
			System.out.println(FListBroken.get(i));     //added later
		}
		System.out.println("Total Broken Links are: "+TotalBrokenLinks);
		System.out.println("------------------------------------------------------------------------------------------------");//added later
		
		for(int i=0; i<=FListValid.size()-1;i++) {      //added later
			System.out.println(FListValid.get(i));      //added later
		}
		System.out.println("Total valid Links are: "+TotalValidLinks);
		
		
		driver.close();
	}

}
