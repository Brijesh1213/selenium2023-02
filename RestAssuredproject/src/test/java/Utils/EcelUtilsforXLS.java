package Utils;


	import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.DataFormatter;
	import org.apache.poi.xssf.streaming.SXSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class EcelUtilsforXLS {
		static HSSFWorkbook workbook;
		static HSSFSheet sheet;
		public EcelUtilsforXLS(String excelPath, String SheetName ){
			try {
              
				//workbook = new HSSFWorkbook(excelPath);
              //if u use above and try to pass in HSSF, it will not work u will have to pass as below.
             
				
				InputStream file = new FileInputStream(excelPath);
				workbook = new HSSFWorkbook(new POIFSFileSystem(file));
				sheet = workbook.getSheet(SheetName);
			} catch (Exception exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}	
		}


		public static void getCellData(int row, int column) {

			DataFormatter formatter = new DataFormatter();
			Object Value = formatter.formatCellValue(sheet.getRow(row).getCell(column));

			System.out.println(Value);	
		}

		public static void getrowCount() {

			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("NO. of rows"+rowCount);			

		}

	}
