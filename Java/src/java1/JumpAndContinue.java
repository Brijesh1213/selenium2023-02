package java1;

public class JumpAndContinue {

	// break, continue
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=10; i++) {
			
			if (i==7) {
				continue; //this will skip 7 and start with 8
				//break will break the loop
			}
			System.out.println("Value is "+ i);
		}
			int j=6; 
			int b=2;
			int h= j%b;
			System.out.println(h);
			
		}

	}


