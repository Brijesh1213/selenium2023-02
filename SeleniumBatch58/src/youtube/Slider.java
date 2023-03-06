package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	//add dimension locator plugin in your chrome
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
		  driver=new ChromeDriver();
		  driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		  driver.manage().window().maximize();
		  
		
		  //first slider
		  System.out.println("----------First slider---------");
		 WebElement slider= driver.findElement(By.xpath("//span[1]"));
		 
		System.out.println( "Location of Minimum slider : "+ slider.getLocation());
		System.out.println( "Dimensions of Minimum slider : "+ slider.getSize());
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider, 100, 0).perform();
		System.out.println( "Location of Minimum slider : "+ slider.getLocation());
		System.out.println( "Dimensions of Minimum slider : "+ slider.getSize());
		//second slider
		System.out.println("----------second slider---------");
		WebElement Endslider= driver.findElement(By.xpath("//span[2]"));
		
		System.out.println( "Location of Minimum slider : "+ slider.getLocation());
		System.out.println( "Dimensions of Minimum slider : "+ slider.getSize());
		Actions act1 = new Actions(driver);
		act1.dragAndDropBy(Endslider, -100, 0).perform();
		System.out.println( "Location of Minimum slider : "+ Endslider.getLocation());
		System.out.println( "Dimensions of Minimum slider : "+ Endslider.getSize());
		
	}

}
