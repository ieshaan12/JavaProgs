class ThreadSR extends Thread{
	String name;
	boolean flag;
	
	ThreadSR(String tName){
		super(tName);
		name= tName;
		flag = false;
		System.out.println("Child"+this);
	}
	
	public void run()
	{
		try {
			for(int n = 5; n>0; n--) {
				System.out.println("Child Thread: "+name+": "+n);
				System.out.println(Thread.currentThread()+ " "+n);
				Thread.sleep(2000);   
				synchronized(this)
				{
					while(flag) {
						wait();
					}
				}
				
			}
		}catch(InterruptedException e) {
			System.out.println("Child Interrupted");
		}
		System.out.println("Exiting Child");
	}
	
	synchronized void mySuspend()
	{
		flag = true;
	}
	
	synchronized void myResume()
	{
		flag = false;
		notify();
	}
}


public class ThreadSuspendResume
{
	public static void main(String args[]) {
		Thread t = Thread.currentThread();
		t.setPriority(1);
		
		ThreadSR nt1 = new ThreadSR("One");
		ThreadSR nt2 = new ThreadSR("Two");
		
		
		nt1.start();
		nt2.start();
		
		
		try {
			Thread.sleep(2000);
			//System.out.println(Thread.currentThread());
			nt1.mySuspend();
			//System.out.println(Thread.currentThread());
			System.out.println("Suspending first Thread");
			
			nt2.mySuspend();
			//System.out.println(Thread.currentThread());
			System.out.println("Suspending second Thread");
			Thread.sleep(2000);
			//System.out.println(Thread.currentThread());
			
			System.out.println("Resuming first Thread");
			nt1.myResume();
			//System.out.println(Thread.currentThread());
			Thread.sleep(3000);
			//System.out.println(Thread.currentThread());
			System.out.println("Resuming second Thread");
			nt2.myResume();
			//System.out.println(Thread.currentThread());
			
			
		}
			catch(Exception e) {
				System.out.println("Main Interrupted");
			}
		
		try {
			nt1.join();//System.out.println(Thread.currentThread());
			nt2.join();//System.out.println(Thread.currentThread());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	//	System.out.println(Thread.currentThread());
		System.out.println("Exiting Main");
		}
}
