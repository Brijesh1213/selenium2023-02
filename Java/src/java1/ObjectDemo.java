package java1;

import java.util.Iterator;



class Clac {
	
	int num1;
	int num2;
	int result;
	
	public void perform(){
	result = num1+num2;
	
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clac obj = new Clac();
		obj.num1=3;
		obj.num2=4;
        obj.perform();
        System.out.println(obj.result);
	}
	
	

}
