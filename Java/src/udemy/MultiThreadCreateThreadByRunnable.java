package udemy;

public class MultiThreadCreateThreadByRunnable implements Runnable {


	Thread T;
	MultiThreadCreateThreadByRunnable(){
		T =new Thread(this, "NewThread");
		System.out.println("Thread "+T);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("This is the new thread");
		System.out.println(T.currentThread());
	}

}

