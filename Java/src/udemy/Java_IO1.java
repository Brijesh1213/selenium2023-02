package udemy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Java_IO1 {
  // print writer --> character base class// talternative for syso
	// syso is suitable for debugging (testing of code) it is not use for real world console. thus u need print writer
	//print in console
	public static void main(String[] args) throws IOException {
		System.out.println("Enter ur data");
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(I);
		PrintWriter p = new PrintWriter(System.out,true); //true is autoflush
		String H =b.readLine();
		p.println(H);

	}

}
