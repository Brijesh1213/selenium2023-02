package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeAndLocationofElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
		  driver=new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.manage().window().maximize();
		 WebElement logo= driver.findElement(By.xpath("	//div[@id='divLogo']"));
		 // location
		System.out.println("location (x,y): "+ logo.getLocation());
		System.out.println("location (x): "+ logo.getLocation().getX());
		System.out.println("location (y): "+ logo.getLocation().getY());
		// Location method2
		System.out.println("rect location (x,y): "+ logo.getRect());
		System.out.println("rect location (x): "+ logo.getRect().getX());
		System.out.println("rect location (y): "+ logo.getRect().getY());
		
		//size
		System.out.println("this is the size (Width,Height): "+logo.getSize());
		System.out.println("this is the height: "+logo.getSize().getHeight());
		System.out.println("this is the Width: "+logo.getSize().getWidth());
		
		//size method 2
		System.out.println("this is the size (Width,Height): "+ logo.getRect().getDimension());
		System.out.println("this is the height: "+ logo.getRect().getHeight());
		System.out.println("this is the Width: "+ logo.getRect().getWidth());
				  
	}

}
