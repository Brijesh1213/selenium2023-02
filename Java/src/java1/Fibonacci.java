package java1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long num, a=0,b=0,c=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Number for leanth of fibonacci");	
		num=in.nextByte();
		for(long i=0; i<num; i++) {
			
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
			}
	}

}
