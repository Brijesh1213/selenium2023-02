package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Interview1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe\\");
		FirefoxDriver  driver=new FirefoxDriver();
		
		driver.get("https://material.angular.io/components/datepicker/overview");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait Wait = new WebDriverWait(driver, 20);
		WebElement date = driver.findElement(By.xpath("//div[@class='mat-form-field-suffix ng-tns-c147-3 ng-star-inserted']"));
		Wait.until(ExpectedConditions.elementToBeClickable(date));
		date.click();
		
		for (int m= 2; m<=4; m++) {
				
			
			for (int n=1; n<=4; n++){
				WebElement MMYY= driver.findElement(By.xpath("(//button[@aria-label='Choose month and year'])[2]"));
				Wait.until(ExpectedConditions.elementToBeClickable(MMYY));
				MMYY.click();
				
				WebElement YY = driver.findElement(By.xpath("//mat-multi-year-view[@class='ng-star-inserted']/table/tbody/tr[2]/td[3]"));
				Wait.until(ExpectedConditions.elementToBeClickable(YY));
				YY.click();					
		WebElement MM = driver.findElement(By.xpath("//mat-year-view[@class='ng-star-inserted']/table/tbody/tr["+m+"]/td["+n+"]"));
		Wait.until(ExpectedConditions.elementToBeClickable(MM));
		MM.click();
		
		for (int i= 3; i<=5; i++) {
		for (int j=1; j<=7; j++){
		//Thread.sleep(2000);
		WebElement DD = driver.findElement(By.xpath("//div[@role='dialog']/mat-calendar/div/mat-month-view/table/tbody/tr["+i+"]/td["+j+"]"));
	    DD.click();
	    
	    if(i>=5 && j==2) {
			break;
		              }
	    Wait.until(ExpectedConditions.elementToBeClickable(date));
	    date.click();
		}}
		Wait.until(ExpectedConditions.elementToBeClickable(date));   
	    date.click();
	    }}
		driver.close();
	}}
		//Thread.sleep(2000);
		//(//tr[@role='row'])[1]/td/button/div[1]
		//nav[@aria-label='Top Categories']/ul/li[1]/a// isnt working
		//nav[@aria-label='Top Categories']/ul)[3]/li
//		List<WebElement> TOP =driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[3]/li"));
//		System.out.println(TOP.size());
//		for (WebElement a :TOP) {
//			System.out.println(a.getText());
		
//		}
		
	
