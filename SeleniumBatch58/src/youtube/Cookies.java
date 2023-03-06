package youtube;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		  System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
		  driver=new ChromeDriver();
		  driver.get("https://demo.nopcommerce.com/");
		  
		  
		//list of all the cookies
		  Set<Cookie> cookie=driver.manage().getCookies();  
		  System.out.println("size of the cookie :"+cookie.size());
		  for(Cookie cuki:cookie) {
			  System.out.println("Name of the cookies : "+cuki.getName());
			  System.out.println("Value of the cookies : "+cuki.getValue());
		  }
		  
//		  driver.manage().addCookie(arg0); //create and add the cookies
		  Cookie cukiobj= new Cookie("MyName3", "12234535");
		  driver.manage().addCookie(cukiobj);
		  cookie=driver.manage().getCookies();
		  System.out.println("Size of the cookie after adding 1 cookie  :  "+cookie.size());
		  
//		  driver.manage().deleteCookie(arg0); //delete specific cookies// this take cookie object
		  
		  driver.manage().deleteCookie(cukiobj);  //passed cookies object 
		  cookie=driver.manage().getCookies();
		  System.out.println("Size of the cookie after deleting 1 cookie  :  "+cookie.size());
//		  driver.manage().deleteCookieNamed(arg0);//delete specific cookie with Name
		  
		  driver.manage().deleteCookieNamed(".Nop.Customer");
		  cookie=driver.manage().getCookies();
		  System.out.println("Size of the cookie after deleting 1 more cookie with name \".Nop.Customer\" :  "+cookie.size());
//		  driver.manage().deleteAllCookies();// delete all cookies
		  driver.manage().deleteAllCookies();
		  cookie=driver.manage().getCookies();
		  System.out.println("Size of the cookie after deleting all cookues :  "+cookie.size());
		  
		  driver.quit();
		  
		  
		  //How to capture Cookies from browser?
		  //how to print cookies from browser?
		  //how to add cookies to the browser?
		  //how to delete specific cookies form the browser?
		  //how to delete all the cookies from the browser?
		  
//		  driver.manage().getCookies();  //rturn the list of all the cookies
//		  driver.manage().addCookie(arg0); //create and add the cookies
//		  driver.manage().deleteCookie(arg0); //delete specific cookies// this take cookie object
//		  driver.manage().deleteCookieNamed(arg0);//delete specific cookie with Name
//		  driver.manage().deleteAllCookies();// delete all cookies
		  
		  
		  

	}

}
