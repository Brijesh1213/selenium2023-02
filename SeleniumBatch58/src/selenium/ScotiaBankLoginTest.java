package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=ETy1xfij_EU&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiRVR5MXhmaWpfRVUiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTYzMzUyNzY0NCwiaWF0IjoxNjMzNTI2NDQ0LCJqdGkiOiIwYTZhNzZmOS1jNWY3LTRlMjAtYTQyZi02MThkYmRkMjVjMjciLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.vGTGz-NiE12ji_haHz2M3sTpbCT-aoNm4ZNp595yKAR8KYmuJ9-Kws27zanmuq0unUNEWddlSJqrcTNGAsTh7ELW4EDw0Sz6l7b1AXQ3as-KeH8S5eh1KwG8jB8INmp5sXmq2bkXWPSwymIC8qC48dRkbE-MMhmqD1HeAUr1kjZwWSDfGhAh0_8jqi9nWv3V6i_kxwCdzZI5qgyrFQf6RqnGnR2OUx3zwVzrgjvDLYWvVKR6OPWGMACPHpwhJhX6o1ZCZtpTGTnTVlSdLFqsl8kkmPJV60A1RZ-nQ__WG5L50hnyehX1Wvc9C5Yl5NJHK-tcb8j9DVXCW5JzBGnJ2Q&preferred_environment=");
	
		driver.findElement(By.name("usernameInput")).sendKeys("ehjbewoire");
		driver.findElement(By.id("password-input")).sendKeys("uifb3riugnr");
		driver.findElement(By.className("ButtonCore__block")).click();
		
		Thread.sleep(2000);
		
		String DisplayErr= "Please check your card number / username or password and try again.";
		String ActualErr= driver.findElement(By.id("globalError")).getText();
		System.out.println(ActualErr);
		if(DisplayErr.equals(ActualErr)) {
			System.out.println("pass");
		}else {System.out.println("fail");
		
		}
		driver.close();
		

	}

}
