package udemy;

public class MultiThreadingInAction implements Runnable {

	
	Thread t;
	String H;
	MultiThreadingInAction(String Y){
		H=Y;
		t= new Thread(this,H);
		System.out.println(t);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0; i<5; i++) {
			System.out.println("Second Thread "+ i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
