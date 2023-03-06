package udemy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream f = new FileInputStream("C:\\Selenium_Workspace\\Java\\Brijesh.txt");
		int  i =f.read();// it return a byte (integer) what ever it reads
		while(i!=-1) {
			
			System.out.print((char)i);
			i = f.read();
		}
		// now adding message in file
		FileOutputStream fo = new FileOutputStream("C:\\\\Selenium_Workspace\\\\Java\\\\Brijesh.txt");
		InputStreamReader j = new InputStreamReader(System.in);
		BufferedReader bj = new BufferedReader(j);
		String s =bj.readLine();
		byte arr[] =s.getBytes();
		
		fo.write(arr);
		
		f.close();
      //  BufferedWriter b = new BufferedWriter();
		
		
	}

}
