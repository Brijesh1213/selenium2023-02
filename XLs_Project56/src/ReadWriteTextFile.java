import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File ("C:\\testing\\temp.txt");
		//create new file temp
		f.createNewFile();
		//write in temp file
		FileWriter fw = new FileWriter(f);
		BufferedWriter BW = new BufferedWriter(fw);
		BW.write("this is 1st line");
		BW.newLine();
		BW.write("this is 2st line");
		BW.newLine();
		BW.write("this is 3rd line");
		BW.newLine();
		BW.write("this is 4th line");
		BW.newLine();
		BW.write("this is 5th line");
		BW.flush();
		//read from temp file
		FileReader fr =new FileReader(f);
		BufferedReader rd = new BufferedReader(fr);
		/*System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());*/
	
	String H;
	int i =0;
		while  ( (H = rd.readLine()) != null)
		{   
			System.out.println(H);
			i++;
		}System.out.println("number of lines "+i);
		
		
		
		
		

	}

}
