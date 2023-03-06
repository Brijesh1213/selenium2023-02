import org.apache.poi.util.SystemOutLogger;

public class ReadWriteExcelFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Xls_Reader xls = new Xls_Reader ("C:\\testing\\NikulTest.xlsx");

System.out.println(xls.getCellData("Data1", "Name", 5));
String email = xls.getCellData ("Data1",1,2);
System.out.println(email);

System.out.println(xls.getColumnCount("Data1"));
System.out.println(xls.getRowCount("Data1"));

xls.setCellData("Data1", "Name", 11, "Rename");
System.out.println(xls.getCellData("Data1", 0, 11));
xls.addColumn("Data1", "Nikul");
xls.removeColumn("Data1", 6);
	}

}
