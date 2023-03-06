package test;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String tool="Selenium";
 System.out.println(tool);
 System.out.println("------------String array-----------");
		 String tools[]= {"Selenium","Jira","Git","TestNg"};
		 System.out.println(tools.length);
		 
		 /*System.out.println(tools[0]);
		 System.out.println(tools[1]);
		 System.out.println(tools[2]);
		 System.out.println(tools[3]);*/
		 	 
		 for(int i=0; i<tools.length; i++){
			 System.out.println(tools[i]);
		 }
		 System.out.println("------------Integer array-----------");
		 int L[] = {11,12,13}; 
		System.out.println(L.length);
		 for (int i=0; i<L.length; i++) {
			 System.out.println(L[i]);
		 }
			 System.out.println("------------Object array-----------");	 
			 Object m[]= {"Jira",50,60};
			 System.out.println(m.length);
			 for (int k=0; k<m.length; k++) {
				 System.out.println(m[k]);
			 }
		 }
	}

