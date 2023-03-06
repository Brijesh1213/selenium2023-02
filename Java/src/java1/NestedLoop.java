
package java1;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------nested loop-----");//print * * * * in 4 lines
				for (int j=1; j<=4;j++) {
				for (int k=1; k<=4; k++) {
					System.out.print("* ");
				}System.out.println();
				}
				System.out.println("---------1 2 3 4-------");
				for (int j=1; j<=4;j++) {
					for (int k=1; k<=4; k++) {
						System.out.print(k+" ");
					}System.out.println();
					}
				System.out.println("---small tests1------");
				for (int j=1; j<=6;j++) {
					for (int k=1; k<=j; k++) {
						System.out.print("* ");
					}System.out.println();
					}
				System.out.println("---small tests2------");
				for (int j=1; j<=6;j++) {
					for (int k=1; k<=j; k++) {
						System.out.print(k+" ");
					}System.out.println();
					}
				
				System.out.println("---small tests2------");
				
			
				for (int j=65; j<=68;j++) {
					for (char k='A'; k<=j; k++) {
						System.out.print(k+" ");
					}System.out.println();
					}
				
				System.out.println("------- test 3 box of $------");
				String h= " ";
			       for (int j=1; j<=4;j++) {
			    	   if (j==2 ^ j==3) {
			    		 System.out.print("$"+h+h+h+h+h+"$"); 
			    		 System.out.println();
			    	   }else {
							for (int k=1; k<=4; k++) {
								System.out.print("$ ");
							}System.out.println();
					}
			    	   
			       }
			       System.out.println("--abcd----");
		    	   for (char k=65; k<=90; k++) {
						System.out.print(k+" ");
		    	   }
		}}
