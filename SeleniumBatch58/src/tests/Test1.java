package tests;

public class Test1 {
 //static Test1 t1 = new Test1();
 static Test2 t2 = new Test2(); // we introduced object from TEst 2 so it will call constructor automatically
 static Test3 t3 = new Test3();
	public static void main(String[] args) {
		// TODO Auto-generated method stuTest1 t1= new Test1();
		Test1 t1 = new Test1();// when we introduce object in main method we dont need static		
System.out.println("I am in main method");
PrintMe();
ScanMe();
t1.TestMe();
t1.PaintMe();
//Test2.ClassMe();//static
//t2.red();//non static
Test3.circle();//static
t3.Square();//non static
ArgumentTest.sum();


	}
	public static void PrintMe() {
		System.out.println("printme");
	}
	public static void ScanMe() {
		System.out.println("SCanme");
	}
	public void PaintMe()
{
		System.out.println("paint me");
}
	public void TestMe()
	{
			System.out.println("test me");
	}
}
