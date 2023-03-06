package udemy;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SortedSetTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // implements sorted set interface
		// data is sorted
		// method used to store data is : tree set
		// unique elements
		//fast retrieval and access
		// does not allow null elements
		//objects stored ate stored in ascending order
		// TreeSet: default , natural (ascending)sorting order, if u provide unsorted data, it will auto sort by Treeset
		// TreeSet(Comparator comparator) : comparator specifies external specification of sorting order
		//TreeSet(collection c), you can pass collection in it
		//TreeSet(Sorted Set s) you can pass sorted set object whichwill convert into Tree set object
		
		// its sorted in results, it uses askii values of chars to sort
		TreeSet<String> L = new TreeSet<String>();
		L.add("john");
		L.add("bonny");
		L.add("lonny");
		L.add("lonny"); //duplicate value not allowed it just ignores it
		
		
		
		//Iterator i= L.iterator();    // ascending iterator
		Iterator i= L.descendingIterator();  // decending iterator
   while(i.hasNext()) {
	   System.out.println(i.next());
   }
   
   // storing objects in Tree set
   // normal way if u do it u will get error, as Tree set does not know how you want to sort those object thus u need comparator
   //
   TreeSet<carz> l1 = new TreeSet<carz>();
   
   carz c1=new carz(5000,"toy","lego");
  	carz c2=new carz(50000,"civiv old","Honda");
  	carz c3=new carz(500000,"X3","BMW");
  	
     l1.add(c1);
     l1.add(c2);
     l1.add(c3);
  	for(carz x:l1) {
  		System.out.println(x.Brand+" "+x.Name+" "+x.Price);
  	}
	}

}
class carz implements Comparable<carz>{
	int Price;
	String Name;
	String Brand;
	carz(int p, String N, String B){
		this.Price=p;
		this.Name=N;
		this.Brand=B;
	}
	@Override
	public int compareTo(carz c) {
		// TODO Auto-generated method stub
		if(Price>c.Price) {
			return 1;
		}
		else if(Price<c.Price){
			return -1;
		}
		else {
		return 0;
		}
	}}
