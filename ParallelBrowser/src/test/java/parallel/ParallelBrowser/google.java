package parallel.ParallelBrowser;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;



public class google extends Base {

    

	@Test
    public void openGoogle() throws InterruptedException {
    	
    	driver.get("https://www.google.com/");
    	
    	
    }
}
