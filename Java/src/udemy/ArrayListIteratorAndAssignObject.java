package udemy;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorAndAssignObject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Object> tools = new ArrayList<Object>();
		tools.add("Brijesh");
		tools.add(1);
		tools.add("India");
		tools.set(1, 3);
		
		Iterator i= tools.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("---adding object to arrayList---");
		
		car c1=new car(5000,"toy","lego");
		car c2=new car(50000,"civiv old","Honda");
		car c3=new car(500000,"X3","BMW");
		
		ArrayList<car>  car1 = new ArrayList<car>();
		car1.add(c1);
		car1.add(c2);
		car1.add(c3);
		System.out.println(car1.size());
		for(int j=0; j<car1.size();j++) {
			
			System.out.println(car1.get(j).Brand+ " "+car1.get(j).Name+" "+car1.get(j).Price);
			
		}
		System.out.println("----enhance loop====");
		for(car x:car1) {
			System.out.println(x.Brand+" "+x.Name+" "+x.Price);
		}

}
	
	
	}
class car{
	int Price;
	String Name;
	String Brand;
	car(int p, String N, String B){
		this.Price=p;
		this.Name=N;
		this.Brand=B;
	}

}
