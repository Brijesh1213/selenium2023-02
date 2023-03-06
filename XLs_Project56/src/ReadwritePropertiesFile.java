import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadwritePropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 FileInputStream f =new FileInputStream ("C:\\testing\\prop.properties");
 Properties x = new Properties();
 x.load(f);
 String browser = x.getProperty("browser");
 System.out.println(browser);
 System.out.println(x.getProperty("url"));
 System.out.println(x.getProperty("correctEmail"));
 //lets add the data back to file named prop
 
 x.setProperty("add", "out1");
 System.out.println(x.getProperty("add"));
 x.setProperty("lhs", "rhs");
 System.out.println(x.getProperty("lhs"));
 //this will give out data but its not saved in file yet so...
 FileOutputStream fo = new FileOutputStream("C:\\testing\\prop.properties");
 x.store(fo, "adding new info to file");
 
	}

}
