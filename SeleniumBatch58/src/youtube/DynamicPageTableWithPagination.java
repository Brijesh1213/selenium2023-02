package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPageTableWithPagination {
  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
		  driver=new ChromeDriver();
		  driver.get("https://demo.opencart.com/admin/index.php?route=common/dashboard&user_token=4c601380322b0ab8066414a3f934ea33");
		  driver.manage().window().maximize();
		  driver.findElement(By.name("username")).sendKeys("demo");
		  driver.findElement(By.name("password")).sendKeys("demo");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='modal-content']/div[1]/button")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("menu-sale")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//ul[@id='collapse-4']/li[1]")).click();
		  String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		  System.out.println(text);
//		  String text1[] = text.split(" ");
//		  char text2 = text1[6].charAt(1);
//		  System.out.println(text2); ....this will do it
		  
		  int start=text.indexOf("(");
		  int end= text.indexOf("Pages");
		String text2=   text.substring(start+1, end-1);
		int x= Integer.valueOf(text2);
		System.out.println(x);
		//see the video https://www.youtube.com/watch?v=55ZxPTqscxI&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=21
		  driver.close();
	}

}
