package Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilsforXlsx {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public ExcelUtilsforXlsx(String excelPath, String SheetName ){//constructor
		try {
		
		
		 workbook = new XSSFWorkbook(excelPath);
		 sheet = workbook.getSheet(SheetName);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		
	}
	
	/*
	 * public static void main(String[] args) { 
	 * getrowCount(); getCellData(); }
	 */
	
//	//public static void getrowCount() {
       
public static void getCellData(int row, int column) {
	
	/*
	 * String excelPath = "./Data/TestData.xlsx"; try { XSSFWorkbook workbook = new
	 * XSSFWorkbook(excelPath); XSSFSheet sheet = workbook.getSheet("Brijesh");
	 */
		
		DataFormatter formatter = new DataFormatter();
		Object Value = formatter.formatCellValue(sheet.getRow(row).getCell(column));
		//double Value = sheet.getRow(1).getCell(2).getNumericCellValue();
		
		System.out.println(Value);
		/*
		 * } catch (Exception exp) { System.out.println(exp.getMessage());
		 * System.out.println(exp.getCause()); exp.printStackTrace(); }
		 */
	
}
        
		public static void getrowCount() {
		//try {
			
			
			/* String projectDir = System.getProperty("user.dir");
			 System.out.println(projectDir); 
			  String excelPath= projectDir+"/Data/TestData.xlsx";*/
			 
			/*
			 * String excelPath="./Data/TestData.xlsx";
			 * 
			 * XSSFWorkbook workbook = new XSSFWorkbook(excelPath); XSSFSheet sheet =
			 * workbook.getSheet("Brijesh");
			 */
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("NO. of rows"+rowCount);
			
			
			
		/*} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}*/
		}

}
