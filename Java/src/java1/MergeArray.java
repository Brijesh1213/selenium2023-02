package java1;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		
	int A1[]= {1,2,9,4};
	int A2[]= {5,6,7,8};
	int b[] = new int [A1.length+A2.length]; // creating array of combine leanth
	
	//copying fist array
	
	System.arraycopy(A1, 0, b, 0, A1.length);
	//copying or adding second array
	System.arraycopy(A2, 0, b, A1.length, A2.length);
	Arrays.sort(b);
	System.out.println(Arrays.toString(b));
	
	}
}


