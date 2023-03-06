package java1;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 0 ;
		int m = n/2 ; //---9---
		int flag=0 ;
		
		
		if(n==0||n==1) { System.out.println(" it is 0 or 1");
		               }
		else {
			
		for (int i =2 ; i<=m ; i++){
			int p = n%i;
			if ( p ==0)   {
				System.out.println(n+" is not a prime");
			flag=1;
			break;	          
		                  }
		                           }
		if (flag==0) {
			System.out.println(n+" is a prime");
			         }		
	                                }
		
		String Jalpa = " Jalpa loves heidy the most in the world";
		String[] h = Jalpa.split(" ");
		String P = h[0];
		System.out.println(P);
		
		int a=0;
		
		for(int i=0; i<=h.length-1; i++) {
			//for(int j1=0; j1<= (h[i].length()-1); j1++) {
				
			//char  j2 = h[i].charAt(j1);
			char j2 =Jalpa.charAt(i);
			if (j2==97) {
				a++;
			}
			//}
			
			//System.out.println("this are count of a's :"+a);
		}
		System.out.println("this are count of a's :"+a);
		System.out.println(Jalpa.indexOf('a'));
		System.out.println(Jalpa.charAt(17));
	
	}
	
	
	
}

