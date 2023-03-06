
package java1;

import java.util.ArrayList;

public class VowelCheck {

	public static void main(String[] args) {
		
		String vowelCheck = "\"mango\"";
		char vowels[]= {'a','e','o','i','u'};
		int n=0;
		int flag=0;
		ArrayList<Object> totalVowel = new ArrayList<Object>();
		
		for(int i=0; i<=vowelCheck.length()-1; i++) {
			for(int j=0; j<=vowels.length-1; j++) {
				if(vowels[j]==vowelCheck.charAt(i)) {
					totalVowel.add(vowels[j]);
					flag=1;
					n++;
				}}		
	}
		if(flag==1) {
			System.out.println("String : "+vowelCheck+" is having vowels "+ totalVowel.toString());
			System.out.println("String : "+vowelCheck+" has this many vowels : " + n);
		}
			else {
			System.out.println("String : "+vowelCheck+" is not having any vowels");
		}
		
	}
}
