package parallel.ParallelBrowser;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;



public class Facebook extends Base {
	
	 

	@Test
	    public void openFacebook() throws InterruptedException {
	    	
	    	driver.get("https://www.facebook.com/");
	    	
	    	
	    }
	

}
