package udemy;

public class GenericBounded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo2<Integer> d= new demo2<Integer>(100);
		d.getNumber();

	}
	
	

}

class demo2<T extends Number>{ // this is the way u extends to Number so it will accept only numbers
	
	T number;
	
	public demo2(T t) {
		t= number;
	}
	
	T getNumber() {
		return number;
	}
}