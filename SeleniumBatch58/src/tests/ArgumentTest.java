package tests;

public class ArgumentTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 sum();
		 sum(10,11);
		 sum(10,11,10);
	}
public static void sum(){
	int a= 4+5;
	System.out.println(a);
}
public static void sum(int b, int c) {
	int a = b+c;
	System.out.println(a);
	
}
public static void sum(int q, int r, int w) {
	int a= q+r+w;
	System.out.println(a);
}
}
