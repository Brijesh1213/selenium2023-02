package test;

import java.util.ArrayList;

public class ArrayListTest {
     // its a non static thus need to establish object
	// Clasname objectname= new Classname();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<String> tools = new ArrayList<String>();{
	   tools.add("Selenium");
	   tools.add("Jira");
	   tools.add("TestLink");
	   tools.add("TestRail");
	   System.out.println(tools.size());
	   System.out.println(tools.get(0));
	   System.out.println(tools.get(1));
	   System.out.println(tools.get(2));
	   System.out.println(tools.get(3));
	   System.out.println("------------------");
	   tools.remove(2);
	   System.out.println(tools.size());
	   System.out.println(tools.get(2));
	   System.out.println("--------------");
	   ArrayList<Object> gain = new ArrayList<Object>();{
	   
		   gain.add(6789);
		   gain.add(12345);
		   gain.add("Jira");
		   System.out.println(gain.size());
		   System.out.println(gain.get(0));
		   System.out.println(gain.get(1));
		   System.out.println(gain.get(2));
	   }
	   }
	   
	  
   }
	   
   
	}


