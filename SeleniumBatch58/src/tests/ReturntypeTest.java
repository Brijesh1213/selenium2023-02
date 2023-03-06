package tests;

public class ReturntypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int i= sum(5,6);
 System.out.println(i);
 System.out.println(sum(5,6));
 String p= hello();
 System.out.println(p);
 System.out.println(hello());
	}
	public static int sum(int b, int c) {
		int a = b+c;
		return a;
	}
	public static String hello() {
		String s = "Hello Java";
		return s;
		
	}

}
