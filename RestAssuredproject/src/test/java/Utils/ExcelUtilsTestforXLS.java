package Utils;

public class ExcelUtilsTestforXLS {
	public static void main(String[] args) {
	String xlpath = "./Data/TestData.xsl.xls";
	String Sheet ="Brijesh";
	EcelUtilsforXLS excel =new EcelUtilsforXLS(xlpath, Sheet);
	excel.getCellData(1,0);
	excel.getrowCount();
}
}



