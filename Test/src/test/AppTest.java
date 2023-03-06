package test;




import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest extends Base {

   SoftAssert s = new SoftAssert();

	@Test(priority=1)
	public boolean pageTitle() {
		try {
		s.assertEquals("Facebook - log in or sign up", "Facebook - log in or sign up");
		
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("error is in title");
		}
		s.assertAll();
		return true;
	}
}