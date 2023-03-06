package udemy;

public class MultiThreadtcreateByThreadClass extends Thread {
	
	
	MultiThreadtcreateByThreadClass(){
		super("New Thread");
		System.out.println(this);
	}
	
	public void run() {
		
		System.out.println("Thread created by Thread class is running");
	}
}
