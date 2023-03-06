package page;




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage {
	public Page page;
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	private By compose =By.id("id__9");
	private By to = By.xpath("//input[@class='ms-BasePicker-input pickerInput_9f838726']");
	private By subject = By.xpath("//input[contains(@id,'TextField')]");
	private By textbox = By.xpath("//div[@role='textbox']");
	private By send = By.xpath("//span[text()='Send']");
	private By attachment = By.xpath("//button[@aria-label='Attach']");
	private By localAttachment = By.xpath("//button[@name='Browse this computer']");
	
	public WebElement getCompose() {
		return getElement(compose);
	}
	public WebElement getTo() {
		return getElement(to);
	}
	public WebElement getSubject() {
		return getElement(subject);
	}
	public WebElement getTextBox() {
		return getElement(textbox);
	}
	public WebElement getSend() {
		return getElement(send);
	}
	public WebElement getAttachment() {
		return getElement(attachment);
	}
	public WebElement getLocalAttachment() {
		return getElement(localAttachment);
	}
	
	public void sendingEmails(String email) throws  AWTException {
		wait.until(ExpectedConditions.elementToBeClickable(getCompose()));
		getCompose().click();
		wait.until(ExpectedConditions.elementToBeClickable(getTo()));
		getTo().sendKeys(email);
		getTo().sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(getSubject()));
		getSubject().sendKeys(file.SubjectOfEmail);
		wait.until(ExpectedConditions.elementToBeClickable(getTextBox()));
		getTextBox().sendKeys(file.DraftForEmail);
		wait.until(ExpectedConditions.elementToBeClickable(getAttachment()));
		getAttachment().click();
		wait.until(ExpectedConditions.elementToBeClickable(getLocalAttachment()));
		getLocalAttachment().click();
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_R);r.keyPress(KeyEvent.VK_I);r.keyPress(KeyEvent.VK_J);r.keyPress(KeyEvent.VK_E);r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_H);r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_PERIOD);
		r.keyPress(KeyEvent.VK_SHIFT);r.keyPress(KeyEvent.VK_Q);r.keyPress(KeyEvent.VK_A);r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_PERIOD);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(getSend()));
		getSend().click();
	}

}
