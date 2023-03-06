package test;

public class Test1 {
   // First Global Variable, then Main method
	// Create Object
	//ClassName ObjectName= new ClassNaame();
	//static Test1 T = new Test1();
	static String H = "print me";
	public
	Test1() {
		System.out.println("I am in constructor");
	}
	
	public static void main(String[] args) {
		Test1 T = new Test1();
		// TODO Auto-generated method stub
		System.out.println("I am in main Method");
		 printme();
		Scanme();
		T.testme();
		//T.paintme();
	}
	
	
   public static void printme() {
	   System.out.println(H);
   }
   public static void Scanme() {
	   System.out.println("Scan Me");
   }
   public void testme() {
	   System.out.println("Test Me");
   }
   public void paintme() {
	   System.out.println("Paint Me Please");
   }
}
