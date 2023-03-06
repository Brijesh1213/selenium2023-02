package java1;

public class WithoutIfAndCapital {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Finding large number without using If");
		withoutIfLargenumber();
		System.out.println("finding Capital letter and its counts from string");
		FindCapitalLetter();
	}
	
	public static void withoutIfLargenumber() {
		int a=10;
		int b=20;
		int Large= a>b?a:b;
        System.out.println(Large);
	}
	
	public static void FindCapitalLetter() {
		String A = "Brijesh Is Learning";
		System.out.println("Main String is : "+A);
		
		String Uppercase ="";
		String Lowercase="";
		int TotalUpperCase; // u can also use =0 and later in if u can say TotalUpperCase++ 
		int TotalLowerCase;
		
		for(int i=0; i<=A.length()-1; i++) {
			char B = A.charAt(i);
			if (B>65 && B<90) {
				Uppercase = Uppercase +B;
				//TotalUpperCase++ this way when u print it will come total number too.
			}
			else if (B>97 && B<122) {
				
				Lowercase=Lowercase+B;
			}
			
		}
		TotalUpperCase = Uppercase.length();
		TotalLowerCase = Lowercase.length();
		System.out.println("UpperCases are : "+Uppercase);
		System.out.println("TotalUpperCaseNumber : "+TotalUpperCase);
		System.out.println("LoweCases are : "+Lowercase);
		System.out.println("TotalLowerCaseNumber : "+TotalLowerCase);
	}

}
