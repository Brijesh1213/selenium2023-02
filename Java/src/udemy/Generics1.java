package udemy;

public class Generics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo d= new demo();
		d.displayMessage("Brijesh");
		d.displayMessage(6);
		d.displayMessage('d');

	}
	
	

}

class demo{
	
	public static <T> void displayMessage(T m){
		System.out.println(m);
	}
}
