
package java1;

public class Pyramid {

	public static void main(String[] args) {
    for(int i=0; i<=5; i++) {	
			if(i==0) {
				for (int k=0;k<=8; k++) {
					if(k==4) {
						System.out.print("1");
					}
						else {
							System.out.print(" ");
						}}}				
			else if(i==1) {
						for (int k=0;k<=8; k++) {
							if(k==3||k==5) {
								System.out.print("1");
							}
							else if(k==4) {
								System.out.print("0");
							}
								else {
									System.out.print(" ");
					    }}}
			else if(i==2) {
				for (int k=0;k<=8; k++) {
					if(k==2||k==4||k==6) {
						System.out.print("1");
					}
					else if(k==3||k==5) {
						System.out.print("0");
					}
						else {
							System.out.print(" ");
			           }}}
			else if(i==3) {
				for (int k=0;k<=8; k++) {
					if(k==1||k==3||k==5||k==7) {
						System.out.print("1");
					}
					else if(k==2||k==4||k==6) {
						System.out.print("0");
					}
						else {
							System.out.print(" ");
			            }}}
			else if(i==4) {
				for (int k=0;k<=8; k++) {
					if(k==0||k==2||k==4||k==6||k==8) {
						System.out.print("1");
					}
					else if(k==1||k==3||k==5||k==7) {
						System.out.print("0");
					}
					else {
							System.out.print(" ");
			}}}
			
							System.out.println();
		}
}
}


