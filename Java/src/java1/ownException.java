package java1;

public class ownException {

	public static void main(String[] args) {
		
       int a=15;
		
		try {
			if(a<18) {
				throw new NotAnAdultEception();
			}
		}
		catch(NotAnAdultEception e) {
			System.out.println(e);
		}
	}

}
