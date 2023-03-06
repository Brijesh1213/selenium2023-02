package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>tools = new ArrayList<String>();
		System.out.println(tools.size());
		tools.add("selenium");
		tools.add("Jira");
		tools.add("Junit");
		System.out.println(tools.size());
		
		tools.add("TestLink");
		tools.add("Java");
		System.out.println(tools.size());
		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		System.out.println(tools.get(4));
		System.out.println("------------");
		for(int i=0;i<tools.size();i++) {
			System.out.println(tools.get(i));}
		tools.remove(0);
		System.out.println(tools.size());
		System.out.println(tools.get(0));
		
	System.out.println("-------");
	char ch;
	LinkedList <Object> x =new LinkedList<Object>();
	x.add("a");
	x.add("b");
	x.add("z");
	x.add(1);
	
	System.out.print(x);
	Collections.reverse(x);
	System.out.println(x);
		
	}
	
		
		
		
	}


