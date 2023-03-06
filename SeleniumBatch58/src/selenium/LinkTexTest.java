package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTexTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		driver.get("https://www.google.com/?gws_rd=ssl");
		//driver.findElement(By.linkText("About")).click();
		wait.until(ExpectedConditions.urlContains("Abo"));
		driver.findElement(By.partialLinkText("Abo")).click();
		
	//	Thread.sleep(2000);
		
		
		String ExpectedUrl= "https://about.google/";
		String ActualUrl=driver.getCurrentUrl();
		System.out.println(ActualUrl);
		
		String ExpectedTitle="Google - About Google, Our Culture & Company News";
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		if(ActualUrl.contains(ExpectedUrl) & ExpectedTitle.equals(ActualTitle)) {
			System.out.println("TestPass");
		}else{
			System.out.println("Testfail");
		}

	}

}
