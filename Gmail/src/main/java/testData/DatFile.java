package testData;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;

import utils.Xls_Reader;

public class DatFile {

		Xls_Reader xls = new Xls_Reader("C:\\Selenium_Workspace\\Gmail\\src\\test\\resources\\config\\Data.xlsx");
	    public	String emailID = xls.getCellData("Data2", 0, 2);
		public String passwordID = xls.getCellData("Data2", 1, 2);
		public	String emailsToBeSent = xls.getCellData("Data2", 2, 2);
		public String SubjectOfEmail = xls.getCellData("Data2", 3, 2);
		public String DraftForEmail = xls.getCellData("Data2",4 , 2);
	
   @DataProvider(name="emails")
   public Object[] emails() {
	   
	   return new Object[] 		   
			   { "trivedi505@gmail.com" };
	   }
  
			   
   }

