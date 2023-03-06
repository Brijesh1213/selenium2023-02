package youtube;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

public static void drawBorder(WebElement element, WebDriver driver) {
	
	JavascriptExecutor js =((JavascriptExecutor) driver);
   js.executeScript("arguments[0].style.border='3px solid red'",element);
}
public static String getTitle(WebDriver driver) {
	
	JavascriptExecutor js =((JavascriptExecutor) driver);
  String title=  js.executeScript("return document.title;").toString();
  return title;
}

public static void clickElement(WebElement element, WebDriver driver) {
	
	JavascriptExecutor js =((JavascriptExecutor) driver);
   js.executeScript("arguments[0].click();",element);
}
public static void generateAlert(String message, WebDriver driver) {
	
	JavascriptExecutor js =((JavascriptExecutor) driver);
   js.executeScript("alert('"+message+"')");
}
public static void refreshBrowser(WebDriver driver) {
	
	JavascriptExecutor js =((JavascriptExecutor) driver);
	js.executeScript("history.go(0)");
  
}

public static void ScrollDown(WebDriver driver) {
	
	JavascriptExecutor js =((JavascriptExecutor) driver);
	js.executeScript("window.scrollTo(0,500)");
  
}
public static void ScrollUp(WebDriver driver) {
	
	JavascriptExecutor js =((JavascriptExecutor) driver);
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
  
}

public static void ZoomInPageBy(WebDriver driver) {
	
	JavascriptExecutor js =((JavascriptExecutor) driver);
	js.executeScript("document.body.style.zoom='150%'");
  
}
public static void ZoomOutPageB(WebDriver driver) {// zoom in and zoom out can be single method too
	
	
	JavascriptExecutor js =((JavascriptExecutor) driver);
	js.executeScript("document.body.style.zoom='10%'");
  
}
public static void flash(WebElement element, WebDriver driver) {
	
	JavascriptExecutor js =((JavascriptExecutor) driver);
	String bgcolor=element.getCssValue("backgroundColor");
	for(int i=0;i<10;i++) {
		changeColor("#000000", element, driver);//1
		changeColor(bgcolor, element, driver);//2
	}
   
}

private static void changeColor(String color, WebElement element, WebDriver driver) {
	JavascriptExecutor js =((JavascriptExecutor) driver);
	js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
	try {
		Thread.sleep(2000);
	}
	catch(InterruptedException e) {
		
	}
}







}
