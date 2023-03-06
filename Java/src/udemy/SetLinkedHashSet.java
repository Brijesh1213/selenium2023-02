package udemy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SetLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ordered version of hashSet
		// LinkedList +Hash Set
		// used LinkedList Doubly Link List
		//When Ordering matters
		//Has set:Unpredictable order during iteration
		// LisnkedHashSet : All unique values
		
		// LinkedHasset() : default hash set
		// LinkedHasset(Collection c) initialise HashSet with elements of collection c
		// LinkedHasset(int capacity)  initiate HashSet with decided capacity
		// LinkedHasset(int capacity,  Flot fillRatio): this will initiate hashSet with given cpacity and Fill ratio
		// add remove, get, iterator
		// below show preserving insertion order
		LinkedHashSet<String> L = new LinkedHashSet<String>();
		L.add("john");
		L.add("bonny");
		L.add("lonny");
		L.add("lonny"); //duplicate value not allowed it just ignores it
		
		
		
		Iterator i= L.iterator();
		
   while(i.hasNext()) {
	   System.out.println(i.next());
   }
   
   // below is assigning to object
   cary c1=new cary(5000,"toy","lego");
	cary c2=new cary(50000,"civiv old","Honda");
	cary c3=new cary(500000,"X3","BMW");
	LinkedHashSet<cary> ll = new LinkedHashSet<cary>();
   ll.add(c1);
   ll.add(c2);
   ll.add(c3);
	for(cary x:ll) {
		System.out.println(x.Brand+" "+x.Name+" "+x.Price);
	}
		

	}

}

class cary{
	int Price;
	String Name;
	String Brand;
	cary(int p, String N, String B){
		this.Price=p;
		this.Name=N;
		this.Brand=B;
	}}
