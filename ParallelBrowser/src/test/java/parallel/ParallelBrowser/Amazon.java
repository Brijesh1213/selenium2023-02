package parallel.ParallelBrowser;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;




public class Amazon extends Base {
	
	
	


	@Test
    public void openAmazon() throws InterruptedException {
    	
    	driver.get("https://www.amazon.ca/");
    	
    	
    }

}
