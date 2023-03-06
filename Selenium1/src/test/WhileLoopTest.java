package test;

public class WhileLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<20){
			System.out.println(i);
			
			if(i==15) {
				System.out.println("found");
				break;
				}
			i++;
		}
		

	}

}
