package udemy;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListUdemy {

	public static void main(String[] args) {
		//Singly >  [value1] [Address of next]  -->[value2][Address of Next]
        //doubly >  [Address of Prev node v0] [value1] [Address of next v1]  --> <--[Address of Prev node v1] [value2] [Address of next v3]
		//doubly >  [Address of Prev node v-1] [value0] [Address of next v1]--><--[Address of Prev node v0] [value1] [Address of next v2]  --> <--[Address of Prev node v1] [value2] [Address of next v3]
		// so if any one v1 node is removed it only changes 
		//[Address of Prev node v-1] [value0] [Address of next v2]--><--[Address of Prev node v0] [value2] [Address of next v3]
		// so removing node in Linked list does not require all nodes move to left shift operation required so manipulation is easy
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("john");
		ll.add("alex");
		ll.add("Philip");
		System.out.println("===add at perticular index===");
		ll.add(1, "Brijesh");
		Iterator i = ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("---merge two link List");
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("ford");
		ll1.add("bmw");
		ll1.add("ferrari");
		ll.addAll(ll1);
		System.out.println(ll);
		System.out.println("---adding element to first and last index another way---");
		ll.addFirst("jalpa");
		ll.addLast("porche");
		System.out.println(ll);
		System.out.println("---remove----");
	   ll.remove("ford");
	   System.out.println(ll);
	   System.out.println("---removing from index---");
	   ll.remove(0);
	   System.out.println(ll);
	   System.out.println("---delete enitre list---");
	   ll.clear();
	   System.out.println(ll);
	}

}
