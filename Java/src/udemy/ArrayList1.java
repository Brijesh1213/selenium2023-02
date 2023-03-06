package udemy;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Object> tools = new ArrayList<Object>();
		tools.add("Brijesh");
		tools.add(1);
		tools.add("India");
		tools.set(1, 3);
		
		System.out.println(tools);

		if(tools.contains(3)) {
			System.out.println("present 3");
		}
		else {
			System.out.println("not present");
		}
		System.out.println("-----enhance for====");
		for (Object K:tools) {
			System.out.println(K);
		}
		
		System.out.println("-----remove index 1----");
		tools.remove(1);
		for (Object K:tools) {
			System.out.println(K);
		}
		System.out.println("-----size------");
		System.out.println(tools.size());
		
		System.out.println("---Array out of array List----");
		
		Object y[] = new Object[tools.size()];
		tools.toArray(y);
		for (Object K:y) {
			System.out.println(K);
		}
		
	}

}
