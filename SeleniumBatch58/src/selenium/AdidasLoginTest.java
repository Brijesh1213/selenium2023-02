package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumjars\\geckodriver.exe\\");
		FirefoxDriver  driver=new FirefoxDriver();
		
		driver.get("https://www.adidas.ca/en/account-login");
		
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@aria-labelledby='login-email_label']")).sendKeys("wec@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("iufvbiubne");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        String H = driver.findElement(By.xpath("//div[@class='errorMessage___2sHhm gl-form-hint gl-form-hint--error']")).getText();
        System.out.println(H);
        String P ="Incorrect email/password ? please check and retry";
        if (P.equals(H)) {
        	System.out.println("pass");	
        }else {
        	System.out.println("Fail");
        }
        		
	}

}
