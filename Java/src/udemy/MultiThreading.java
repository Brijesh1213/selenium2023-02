package udemy;

public class MultiThreading {

	// multiple execution witth diff path
	//process based: allow you to run two or more programs simultaniously , example : browser+ide usage
	// Thread based: Allows to perform multi task in one program, Example: Music player: search song and play 
	
	//multi threading healps using CPU  efficient usage 
	// single thread: it has event loops, where polling is used, and one by one event is called to run with polling mechanism
	// so in multi thereading if there is pause while event 1 is running, event 2 will use that pause time to rune.
	//single core process one process at time, but they can use time when one process is paused for some reason.
	// multi core system will use multiple theread and multiple process can run too.
	
	
	//create multi threadig in java
	// two ways : thread class & runnable interface
	// thread class: multiple methods to control thread
	// we can extend thread class or implement runnable interface
	
	// thread class methods:
	// get Name: obtain get thread name
	//getpriority : Obtain thread priority
	// IsAlive : Determine whether thread is still runnning
	// join: wait for thread to terminate  (if u want time to let the thread run)
	// run: to run the thread
	// sleep; suspend or make thread sleep for given time
	// start: it starts the thread by calling run method
	
	
	//Main thred: when we execute code main thread will automatically be created, it will run last as all child thread need to run and comeplete first
	// currentThread()  method , get access to main thread, it retuns reference main thread, we can get thread priority, name , setNameetc.
	// return is Thread[main,5,main] , name , priority and threadGroup

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new Thread();
		System.out.println(t.currentThread());
		System.out.println(t.getName());
		t.setName("Brijesh");
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getThreadGroup());

	}

}
