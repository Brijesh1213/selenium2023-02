package udemy;

import java.util.Scanner;

public class frequencyExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your string to count a's in it");
		Scanner s =new Scanner(System.in);
		String x = s.next();
		char f []=x.toCharArray();
		int a=0;
		for(char i:f) {
			
			if(i=='a') {
				a++;
			}
		}
		System.out.println("this are the count of a :"+a);

	}

}
