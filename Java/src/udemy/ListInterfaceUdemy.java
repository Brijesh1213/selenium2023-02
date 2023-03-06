package udemy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterfaceUdemy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LIst is inter face implemented by ArrayList, LinkedList, Vector and(stack)
		//List can have duplicate values and values tsored are i sequencial order
		
		List<String> L = new ArrayList<String>();// add remove, get, iterator
		L.add("john");
		L.add("bonny");
		L.add("lonny");
		L.add(1,"alex");
		L.remove("bonny");
		L.remove(0);
		L.set(0, "Brijesh");
	    L.get(0);
		
		Iterator i= L.listIterator(); // or use iterator();
		
   while(i.hasNext()) {
	   System.out.println(i.next());
   }
	}

}
