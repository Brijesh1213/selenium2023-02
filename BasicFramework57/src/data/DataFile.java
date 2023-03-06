package data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Xls_Reader;

public class DataFile {
	WebDriver driver;
Xls_Reader xls = new Xls_Reader("C:\\testing\\NikulTest.xlsx");
	//LoginTest Data
	public String WrongEmail = xls.getCellData("Sheet1", 1, 1);
	public String WrongPassword = xls.getCellData("Sheet1", 1, 2);
	public String globalErr = xls.getCellData("Sheet1", 1, 3);
	public String EmptyEmailErr = xls.getCellData("Sheet1", 1, 4);
	public String EmptyPasswordErr =xls.getCellData("Sheet1", 1, 5);
	public String EmailWithSpecialCharErr= xls.getCellData("Sheet1", 1, 6);
	public String EmailWithSpecialChar= xls.getCellData("Sheet1", 1, 7);
  
// WebElement


}
//userTest Data

//SearchTest data

//Profiletest data