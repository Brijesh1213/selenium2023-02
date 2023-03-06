package udemy;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // addaed aftr jdk8
		// method does not have nay name
		// you cant call this method
		//it is used to implement methods of functional interface to implement
		//functional interface: interface which contains only one abstract method
		 //abstract method: only signature with no boday
		//interface: a class woth only abstract method
		//functional interface represnts a signle action it has only one abstract method
		//lamdaoperator  "->" 
		// left side  ->  right side
		//left side : parameters required by lambda expression
		// right side-. Lambda body, specify the action of lambda expression
		//Lambda body  has two types:  signle expression,  block of code
		// ()-> 100  work same as method that returns value 100 with no parameters
		// above left side is empty parameter lambda expression and thanwe have 100 as value
		// -> 100*200 it returns multiplication of twi integer,
		
		// (n) ->n*200...n is parameter and returns multiplication with 200
		// (a,b)-> a*b ..those parameter is multiplied
		// now we need functional interface.
		//after java 8 default implementation for method declaration is possible in java 8 and aabove
		// so for any functional interface, is an interface that has only signle abstract method
		
		number n;
		//n=()->100*200; ..........(1)
		n=()->10.2*19.6; //.........(2)
		
		System.out.println(n.displayNum());
		System.out.println("---------lambda expression with parameter-----interface demo");
		demo d;
		d=(a,b)-> a*b;
		System.out.println(d.demoMethod(10, 20));
		
		System.out.println("passing block of code");
		
		blockofcode bc;
		bc=(int a, int b)->{
			if(a>b) {
				System.out.println("is adult");
			}
			else {
				System.out.println("is not an adult");
			}
		};
		bc.displaymethod(19, 18);
		
		System.out.println("generic method for lamda");
		Message <String> message;
		message =(m)-> { return m;
		
	};
	System.out.println(message.displaymessage("hello I am generic"));
	
	System.out.println("lamda as argument ");
	System.out.println(LamdaAsArgss.LamdaasArgssss((m)->{return m;}, "this lambda args"));

}

interface number {
	//int displayNum(); ..........(1)
	double displayNum();//...........(2)
}
interface demo {
	//int displayNum(); ..........(1)
	double demoMethod(int a, int b);//...........(2)
}
// passing block of code
interface blockofcode{
	void displaymethod(int a, int b);
}
interface Message<T>{
	T displaymessage(T message);
	//this for generic method
}
interface lamdaAsArgs{
	
	String displaymessage1( String K);
}
 public static class LamdaAsArgss{
	
	 static String LamdaasArgssss(lamdaAsArgs L , String s) {
		return L.displaymessage1(s);
	 }
		 
	 }
}
