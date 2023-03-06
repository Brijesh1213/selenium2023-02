package udemy;

public class Generics {
// afte jdk 5 its been introduces
	// class interface we can create in type safe manner
	//whatever data we process, we can process different data type with out any problem.
	// classes, interface, and methods can process diff type of data
	// when algorythm accept int values, it will take only int datatype ony
	// so algorythm should accept different types of data which can be enable by generics
	//generics are parametrised type, we can create interface, classes and methods
	//we can creeate signle class with compatible with diff data type
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		demo1<Integer> d = new demo1<Integer>(100);
//        System.out.println(d.getValue());
//    	demo1<String> d1 = new demo1<String>("Hello");
//        System.out.println(d1.getValue());
		
		demo1<Integer,String> d = new demo1<Integer,String>(100,"Hello");
		
		System.out.println(d.getMessage());
		System.out.println(d.getValue());
		
		
	}

}

 class demo1<T ,Y>{
	T Value ;
	Y Message;
	
	public demo1(T v, Y w) {
		Value=v;
		Message =w;
	}
	 T getValue() {
		return Value;
	}
	 Y getMessage() {
			return Message;
		}
}
 
 
