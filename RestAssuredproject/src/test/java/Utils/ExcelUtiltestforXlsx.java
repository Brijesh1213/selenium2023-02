package Utils;

public class ExcelUtiltestforXlsx {// if u had extened ti ExcelUtils u dont need to create object
	public static void main(String[] args) {
		
		String xlpath = ".\\Data\\TestData.xlsx";
		String Sheet ="Brijesh";
		ExcelUtilsforXlsx excel =new ExcelUtilsforXlsx(xlpath, Sheet);
		excel.getCellData(1, 0);
		excel.getrowCount();
	}

}

