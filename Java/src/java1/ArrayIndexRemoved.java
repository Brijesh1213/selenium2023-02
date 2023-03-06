package java1;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayIndexRemoved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {1,2,3,4,5,6,7};
		
		int indexedRemoved = 1; // we are removing number 2 from array as index is 1
		for (int i= indexedRemoved; i<myArray.length-1; i++) {
			myArray[i] =myArray[i+1];
		}
		System.out.println("printed new array with removed index "+ Arrays.toString(myArray));
		
		System.out.println("----another method--------");
		
int[] myArray1 = {1,2,3,4,5,6,7};
	ArrayList<Object> N1 = new ArrayList<Object>();
		//int indexedRemoved1 = 3; // we are removing number 2 from array as index is 1
		for (int i= 0; i<myArray1.length-1; i++) {
			if (i==1) {
				continue;
			}
			N1.add(myArray1[i]);	
		}
		System.out.print("printed new array with removed index "+ N1.toString());

	}

}
