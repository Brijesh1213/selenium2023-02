package udemy;

public class MultipleThreadCreateMultipleThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleThreadCreateMultipleThread t1 = new MultipleThreadCreateMultipleThread("1");
		MultipleThreadCreateMultipleThread t2 = new MultipleThreadCreateMultipleThread("2");
		MultipleThreadCreateMultipleThread t3 = new MultipleThreadCreateMultipleThread("3");
		t1.T.start();
		t2.T.start();
		t3.T.start();

	}

}
