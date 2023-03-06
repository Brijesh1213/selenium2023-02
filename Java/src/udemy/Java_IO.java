package udemy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_IO {
  
	
	// I/O is input and out put, there are two streams for data, byte stream and CharStream, data goes to and from key board server, devices 
	// byte stream - data read binary data  // input stream, output Stream --> multiple sub classes --> methods(read and write)
	//charStream -  handle I/O charactr, it uses Unicode // reader & writer classes--> read & write methods
	//Sytem Class --> java.lang package---> pre define variable> in, out, err....used in scanner via input stream and Syso via  output stream,  and err is  standard errror stream, which is console
	//
	//Use data from File is required FileInputStream
	//used so far SCanner, And SySO...out
	// real world use UI instead scanner console ussage for input data.
	//
	public static void main(String[] args) throws IOException {
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
       String Sentence = b.readLine();
       System.out.println(Sentence); // took input from user// alternative for scanner
	}

}
