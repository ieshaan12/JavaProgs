class ThreadPrior extends Thread{
	String name;
	ThreadPrior(String tName, int priority){
		super(tName);
		name= tName;
		setPriority(priority);
		System.out.println("Child"+this);
	}
	
	public void run()
	{
		try {
			for(int n = 5; n>0; n--) {
				System.out.println("Child Thread: "+name+": "+n);
				Thread.sleep(500);   
			}
		}catch(InterruptedException e) {
			System.out.println("Child Interrupted");
		}
		System.out.println("Exiting Child "+this.getPriority()+" "+Thread.currentThread());
	}
}


public class ThreadPriority
{
	public static void main(String args[]) {
		Thread t = Thread.currentThread();
		t.setPriority(1);
		
		ThreadPrior nt1 = new ThreadPrior("One",2);
		ThreadPrior nt2 = new ThreadPrior("Two",Thread.MAX_PRIORITY);
		ThreadPrior nt3 = new ThreadPrior("Three",Thread.NORM_PRIORITY);
		
		nt1.start();
		nt2.start();
		nt3.start();
		
		try {

			
			nt1.join();
			nt2.join();
			nt3.join();
			
			
			for(int n = 5; n>0; n--) {
				System.out.println("Main thread"+n);
				Thread.sleep(1000);   
			}
		}
			catch(Exception e) {
				System.out.println("Main Interrupted");
			}
		System.out.println("Exiting Main");
		}
}
