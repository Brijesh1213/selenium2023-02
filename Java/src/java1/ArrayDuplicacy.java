package java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayDuplicacy {
	public static void main(String[] args) {
		
		ArrayList<Integer> AL = new ArrayList<Integer>(Arrays.asList(1,1,2,2,3,3,3,4,4,4,4));
		LinkedHashSet <Integer> LSet = new LinkedHashSet <Integer>(AL);
		ArrayList<Integer> UpdatedAL = new ArrayList<Integer>(LSet);
		System.out.println(UpdatedAL);
		
		String A = "010101";
		String B = "101101";
		
		
		int x=0;
		for (int i=0; i<=A.length()-1; i++){

		if (A.charAt(i)==B.charAt(i)){

		x++;
		}
		
		}System.out.println(x);
		
		int P[]= {1,1,2,2,3,4,3,5,4};
		int y = P.length-1;
		removeDuplicate(P,y);
		
	
	}
	public static int removeDuplicate(int K[], int n) {
		 
		
		int[] temp = new int[n];
		int j=0;
		for (int i=0; i<=n; i++ ) {
			if(K[i]!=K[i+1]) {
				temp[j++]=K[i];  //[010234354
			}
		}temp[j++]=K[n-1];
		
		for(int i=0; i<j; i++){
			K[i]=temp[j];
		}
		return j;
	}
	
}
