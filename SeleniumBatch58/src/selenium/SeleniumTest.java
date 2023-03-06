package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Seleniumjars\\geckodriver.exe\\");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		WebElement Woman= driver.findElement(By.className("sf-with-ul"));
		WebElement SummerDress= driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[1]"));
		
        Actions hover = new Actions(driver);
        hover.moveToElement(Woman).build().perform();
        Thread.sleep(2000);
       hover.moveToElement(SummerDress).build().perform();
        SummerDress.click();
        Thread.sleep(2000);
 
       
 JavascriptExecutor JSE = (JavascriptExecutor) driver;
       JSE.executeScript("window.scrollBy(0,400)");
       Thread.sleep(2000);
       WebElement view = driver.findElement(By.className("left-block"));
       hover.moveToElement(view).build().perform();
       WebElement QView =  driver.findElement(By.xpath("//ul[@class='product_list grid row']/li[1]/div[1]/div[1]/div[1]/a[2]"));
       QView.click();
       Thread.sleep(2000);
        driver.switchTo().frame(0);
        WebElement sizes = driver.findElement(By.id("group_1"));
        Select Size = new Select(sizes);
        Size.selectByValue("2");
        driver.findElement(By.className("exclusive")).click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        WebElement Cshop= driver.findElement(By.xpath("//span[@title='Continue shopping']"));
       Thread.sleep(2000);
       Cshop.click();
       Thread.sleep(2000);
       JSE.executeScript("window.scrollBy(0,-400)");
       WebElement cart = driver.findElement(By.xpath("//div[@class='shopping_cart']/a[1]"));
     
       hover.moveToElement(cart).build().perform();
       //Thread.sleep(2000);
      driver.findElement(By.xpath("//p[@class='cart-buttons']/a[1]/span[1]")).click();
      driver.manage().window().maximize();
driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']/a[1]")).click();
driver.findElement(By.id("email_create")).sendKeys("hjjjkffr505@gmail.com");
driver.findElement(By.id("SubmitCreate")).click();
driver.findElement(By.id("id_gender1")).click();
driver.findElement(By.id("customer_firstname")).sendKeys("brijesh");
driver.findElement(By.id("customer_lastname")).sendKeys("trivedi");
driver.findElement(By.id("passwd")).sendKeys("Lalo@12345");
WebElement drop = driver.findElement(By.id("days")); 
WebElement month = driver.findElement(By.id("months"));
WebElement year =driver.findElement(By.id("years"));
Select down = new Select(drop);
down.selectByValue("10");
Select Month = new Select(month);
Month.selectByValue("3");
Select Year = new Select(year);
Year.selectByValue("1992");
driver.findElement(By.id("firstname")).sendKeys("Brijesh");
driver.findElement(By.id("lastname")).sendKeys("Trivedi");
driver.findElement(By.id("address1")).sendKeys("14-36 Duke St");
driver.findElement(By.id("city")).sendKeys("Hamilton");
WebElement State = driver.findElement(By.id("id_state"));
Select States = new Select(State);
States.selectByValue("2");
driver.findElement(By.id("postcode")).sendKeys("99501");
WebElement Country = driver.findElement(By.id("id_country"));
Select country = new Select(Country);
driver.findElement(By.id("phone_mobile")).sendKeys("+16477671805");
driver.findElement(By.id("alias")).sendKeys("14-37 bold st");
driver.findElement(By.id("submitAccount")).click();

JSE.executeScript("window.scrollBy (0,500)");
driver.findElement(By.name("processAddress")).click();
driver.findElement(By.id("cgv")).click();
driver.findElement(By.name("processCarrier")).click();
List<WebElement> OrderList = driver.findElements(By.xpath("//td[@class='cart_description']/small[1]"));
String List1 = "SKU : demo_5";
if(OrderList.get(0).getText().equals(List1)) {
	System.out.println("SummerDress Prestent");
}else {System.out.println("Item 1 on List Not Present");}


       // hover.moveToElement(Cshop).click();
       // Alert P= driver.switchTo().alert();
        //P.dismiss();        
        
	}

}
