package java1;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionOnarrayList {
	
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> List = new CopyOnWriteArrayList<String>();
		
		List.add("Brijesh");
		List.add("Jalpa");
		List.add("Heidy");
		
		for(String H: List) {
			System.out.println(H);
		}
		
		// or 
		System.out.println("-----another method-----");
		Iterator<String> it= List.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
