package youtube;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String location =System.getProperty("user.dir")+"\\Download\\";
		
		//chrome
		HashMap preferences = new HashMap();
		preferences.put("donwload.default_directory", location);
		ChromeOptions Options= new ChromeOptions();
		Options.setExperimentalOption("prefs", preferences);
		
		//download pdf file setting
		
//		HashMap preferences = new HashMap();
//		preferences.put("plugins.always_open_pdf_externally", true); // download pdf directly, as some time it opens in view mode in browser
//		preferences.put("donwload.default_directory", location);
//		ChromeOptions Options= new ChromeOptions();
//		Options.setExperimentalOption("prefs", preferences);
		
		//Edge
		//HashMap preferences = new HashMap();
 		//preferences.put("donwload.default_directory", location);
		//EdgeOptions Options= new EdgeOptions();
		//Options.setExperimentalOption("prefs", preferences);
		
        //Edge download pdf file setting
		//HashMap preferences = new HashMap();
	    //preferences.put("plugins.always_open_pdf_externally", true); // download pdf directly, as some time it opens in view mode in browser
		//preferences.put("donwload.default_directory", location);
		//EdgeOptions Options= new EdgeOptions();
		//Options.setExperimentalOption("prefs", preferences);
		
		//FireFox
		
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword, application/csv, text/csv, text/plain, application/octet-stream doc xls pdf txt");
//		profile.setPreference("browser.download.folderList", 2)  (if 0 its desktop, if 1 it will go download, if 2 it will go to desire location)
//		profile.setPreference("browser.download.dir", location)
//		profile.setPreference("browser.download.manager.showWhenStarting", False)  (Not Explained in video)
//		FirefoxOptions option = new FirefoxOptions();
//		option.setProfile(profile);
//		WebDriver driver = new FirefoxDriver(option);
		
		//firefox pdf download
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("pdfjs.disabled", true)
//		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword,application/pdf, application/csv, text/csv, text/plain, application/octet-stream doc xls pdf txt");
//      application/msword  is MIME type
//		profile.setPreference("browser.download.folderList", 2)  (if 0 its desktop, if 1 it will go download, if 2 it will go to desire location)
//		profile.setPreference("browser.download.dir", location)
//		profile.setPreference("browser.download.manager.showWhenStarting", False)  (Not Explained in video)
//		FirefoxOptions option = new FirefoxOptions();
//		option.setProfile(profile);
//		WebDriver driver = new FirefoxDriver(option);
		
		WebDriver driver;
		  System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver1.exe\\");
		  driver=new ChromeDriver(Options);
		  
		  
		  
		  driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		  driver.manage().window().maximize();
		  JavaScriptUtil.ScrollDown(driver);
		  driver.findElement(By.xpath("//tbody//tr[1]/td[5]/a[1]")).click();
		  
		  //frame issue pending
//		  Thread.sleep(2000);
//		List< WebElement> Frames = driver.findElements(By.tagName("iframe"));
//		System.out.println(Frames.size());
//		int i =0;
//		for(WebElement f:Frames) {
//			try {
//			if(f.getAttribute("title").equals("Advertisement")) {
//				driver.switchTo().frame(f);
//				i=1;
//				break;
//			}}
//			catch(Exception e) {
//				
//			}
//			
//		}System.out.println(i);
//		  
//		  driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
//		  driver.close();
		  
		  
		  
		  
	}

}
