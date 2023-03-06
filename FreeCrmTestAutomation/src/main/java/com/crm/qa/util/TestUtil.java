package com.crm.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static  long Page_Load_Time_Out = 20;
	public static long Implicit_wait =20;
	
	public void SwitchToFrame(String a) {
	driver.switchTo().frame(a);
	}
	public static Object [][]getData() {
		Xls_Reader xls = new Xls_Reader("C://selenium//JavaSelenium//Nikultes.xlsx");
		
		   String fname1=xls.getCellData("Data2", 0, 2);
		   String Lname1=xls.getCellData("Data2", 1, 2);
		   String fname2=xls.getCellData("Data2", 0, 3);
		   String Lname2=xls.getCellData("Data2", 1, 3);
		   return  new Object[][]{
			   new Object [] {fname1,Lname1},
			   new Object [] {fname2,Lname2},
		   };
	}
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	
	
	

}
