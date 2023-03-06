package udemy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SetHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//set is chaild interface of collection
		// set-its not in sequencial order 
		//set- does not allow duplicacy
		//set interface does not have its own methods , it has taken methods from colletion interface
		
		//HashSet
		// HashSet is calss that implements set interface
		//It used hash Table and hash Mechanism
		//HashSet, it does not allow duplicacy and and sequence is not maintained
		// searching is more efficient
		
		//Hashing mechanism
		//assume thats array has multiple nodes u need index of node to search for element
		//assigning value = to index number , 1 to 1index , 2 to 2 index...
		//but lets say array has 7 indexs and vlaue we need to add is 15 then? we cannt have index 15th
		
		//so Hash Function
		//X%(mod) 8 (total indexes)...so 15%8 will be 7, so 7th index....we will store 15, but what if we have 7 in list too, 
		//so 7 already occupid 7th index thus 15th needs to be added at 7th index to...waht to do?
		
		//HashTable
		//int n =7%8; //7 devide by 8 remainder is 7
		//int n =15%8; //15 devide by 8 remainder is 7
		// so now we will add values to indexes based on x(value to be added)% total indexes= remainder(indexnumber where we put value x)
		//76%8=4....so at 4th index we will ad 76
		// same way values 15 and 7 will be added at 7th index only
		
		//methods are same as List
		
		HashSet<String> L = new HashSet<String>();// add remove, get, iterator
		L.add("john");
		L.add("bonny");
		L.add("lonny");
		
		L.remove("bonny");
		L.remove(0);
		
		
		Iterator i= L.iterator();
		
   while(i.hasNext()) {
	   System.out.println(i.next());
   }
		
	}

}
