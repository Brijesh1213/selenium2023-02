package udemy;

import java.util.LinkedList;

public class LinkedListSaveObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carx c1=new carx(5000,"toy","lego");
		carx c2=new carx(50000,"civiv old","Honda");
		carx c3=new carx(500000,"X3","BMW");
		LinkedList<carx> ll = new LinkedList<carx>();
        ll.add(c1);
        ll.add(c2);
        ll.add(c3);
		for(carx x:ll) {
			System.out.println(x.Brand+" "+x.Name+" "+x.Price);
		}
		for(int i=0; i<ll.size();i++) {
			System.out.println(ll.get(i).Brand+" "+ll.get(i).Name+" "+ll.get(i).Price);
		}
	}	

}

class carx{
	int Price;
	String Name;
	String Brand;
	carx(int p, String N, String B){
		this.Price=p;
		this.Name=N;
		this.Brand=B;
	}
}