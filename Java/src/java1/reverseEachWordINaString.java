
package java1;

import java.util.Arrays;
import java.util.List;

public class reverseEachWordINaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String N ="abcd xyz";
	System.out.println(N); //...............1
	String[] O = N.split(" ");
   System.out.println(O[1]+" "+O[0]); //..............2
   
	String reversestring="";
	
	for (String Word :O)
	{
		//System.out.println(Word.length());
		
		String reverseword="";
		for(int i = Word.length()-1; i>=0; --i){
			//System.out.println(i);
			reverseword=reverseword+Word.charAt(i);
		}
		
		reversestring=reversestring+reverseword+" ";
	}
	
System.out.println(reversestring);//...................3

System.out.println("----another method-----"); ///........4
String K ="fgh xyz";
System.out.println(K); //.......5
String g = new StringBuilder(K).reverse().toString();
System.out.println(g);//..........6
String[] L = K.split(" ");

String Rword="";
for (String W:L) {
	
	StringBuilder sb = new StringBuilder(W);
	sb=sb.reverse();
	Rword=Rword+sb.toString()+" ";
				
}
System.out.println(Rword);//......7

System.out.println("----sparate-----");
String B = "Brijesh";
System.out.println(B);
char [] B1 = B.toCharArray();  
for (int i= B1.length-1; i>=0; --i) {
	System.out.print(B1[i]); //System.out.print(B.charAt(i));
}
System.out.println();
System.out.println("-----sparate---Reversing words only");
//String X= new  StringBuilder(H).reverse().toString();
		System.out.println("Enter string to reverse: My name is Brijesh");
		String str = "My name is Brijesh";
		String a[] = str.split(" ");
		
		for(int i=a.length-1; i>=0 ;i--){
		System.out.print(a[i]+" ");	
		}
		System.out.println();
		
		String P= "Hello Java";
		String G[]= P.split(" ");
		System.out.println(G[0]);
	}
}