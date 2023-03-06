package pages;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass extends BaseClass{
	
	
	 RegistrationClass rc ;
	 Mainpage mp ;
	
	
	@BeforeMethod
	public void starting() throws IOException {
		
		initialization();
		
		mp = new Mainpage();
		mp.getClickbtn();
		rc = new RegistrationClass();
		rc.getFirstname();
		rc.getLastname();
		rc.getEmail();
		rc.getPassword();
		rc.getMonth();
		
		
		
	}

	@Test
	
	public void signup() {
		
		
	String exp = rc.month.getAttribute("value");
	
	Assert.assertEquals(exp , "2");
	
	}
	
 
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
   
}