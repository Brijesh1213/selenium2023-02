package selenium;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;

public class readWriteText {

	public static void main(String[] args) throws IOException {
		
		
		
		File f = new File("C:\\testing\\Brijesh.txt");
		f.createNewFile();
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Brijesh");
		bw.newLine();
		bw.write("Brijesh1");
		bw.flush();
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
	 // System.out.println(br.readLine());
	 // System.out.println(br.readLine());
	  System.out.println("------------");
	 int i=1;
	  while (i<=2) {
		  System.out.println(br.readLine());
		  i++;
		  }
	
	}

}
