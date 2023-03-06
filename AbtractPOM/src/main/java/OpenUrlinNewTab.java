import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenUrlinNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		  driver.get("https://demo.nopcommerce.com/");
		  
		driver.switchTo().newWindow(WindowType.TAB);  //..this will open in new tab
		//  driver.switchTo().newWindow(WindowType.Window); //..this will open in new window
		  driver.get("https://www.opencart.com/");
		  driver.manage().window().maximize();

	}

}
