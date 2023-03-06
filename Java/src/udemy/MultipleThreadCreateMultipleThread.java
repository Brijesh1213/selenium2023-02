package udemy;

public class MultipleThreadCreateMultipleThread  implements Runnable{

	
	String name;
	Thread T;
	MultipleThreadCreateMultipleThread(String H){
		name =H;
		T = new Thread(this,H);
		System.out.println(T);
	}
	@Override
	public void run() {
		System.out.println("this thread is running");
		
	}

}
