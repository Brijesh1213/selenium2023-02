package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class FormPage extends TestBase{
  int i=1;
	public FormPage() throws IOException {
		super(driver, wait);
		
	}
   
    
	@FindBy (name="firstname")
	WebElement firstname ;
	
	@FindBy (name="lastname")
	WebElement lastname;
	
	@FindBy(xpath="//input[@value='Male']")
	WebElement Sex;
	
	@FindBy(xpath="//input[@value='5']")
	WebElement Exp;
	
	@FindBy (xpath ="(//input[@name='tool'])[1]")
	WebElement falvours;
	
	@FindBy (xpath="(//input[@type='text'])[3]")
	WebElement Date;
	
	@FindBy(name="submit")
	WebElement loginButton;
	
	@FindBy (name="continents")
	WebElement Continent;
	
	@FindBy (name="selenium_commands")
	WebElement Command;
	
	
	public void enterFirstName(String firstName1) throws InterruptedException {
		
		firstname.sendKeys(firstName1);	
	}
   public void enterLastName(String lastName1) throws InterruptedException {
		lastname.sendKeys(lastName1);	
	}
   public void SelectSex() throws InterruptedException {
		Sex.click();	
	}
   public void SelectExpDateProfession() throws InterruptedException {
		Exp.click();
		Date.sendKeys("2022/05/25");
		for(int i=1; i<=2; i++) {
		driver.findElement(By.xpath("(//input[@name='profession'])["+i+"]")).click();
		}
		JavascriptExecutor jse =  (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy (625, 650)");
		//jse.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.id("print-page")));
	}
   public void SelectFlavours() throws InterruptedException {
	// wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[text()=' RC ']")))) ;
	   Thread.sleep(2000);
	List<WebElement> List=  driver.findElements(By.name("tool"));
   for(WebElement L : List) {
	   L.click();   
	   }
	}
   
   public void SelectContinent() throws InterruptedException{
	   Select s = new Select(Continent);
	   s.selectByIndex(5);
   }
   
   public void SelectSeleniumCommand() {
	   
	   Select s = new Select(Command);
	   s.selectByIndex(3);
	   loginButton.click();
	   driver.switchTo().alert().accept();
   }

	
	
}

