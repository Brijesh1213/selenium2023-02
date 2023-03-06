package udemy;

public class MultiThreadingInActionMain {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		MultiThreadingInAction t2 = new MultiThreadingInAction("2");
		
	
		t2.t.start();
		//t2.t.join();/// this is join...which join two thread , in our case its second thread and mian thread in such a way it will keep one thread on hold until firt one get executed fully.
		
		for(int i=0; i<5; i++) {
			System.out.println("Main Thread "+ i);
			Thread.sleep(1000);
		}
		

	}

}
