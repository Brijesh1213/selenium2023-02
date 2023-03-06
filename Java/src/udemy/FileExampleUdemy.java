package udemy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileExampleUdemy {

	public static void main(String[] args) throws IOException  {
	    
		System.out.println("Enter Deposit ammount");
		Scanner s = new Scanner(System.in);
		int Deposit = s.nextInt();
		Scanner sc = new Scanner(new File ("C:\\Selenium_Workspace\\Java\\balance.txt"));
		int currentB = sc.nextInt();
		
		System.out.println(currentB+" Current Balance ");
		currentB+=Deposit;
		System.out.println(currentB+" updated Current Balance ");
		
		FileOutputStream fo = new FileOutputStream("balance.txt");
		String o = Integer.toString(currentB);
		byte arr[] = o.getBytes();
		fo.write(arr);
		fo.close();
	}

}
