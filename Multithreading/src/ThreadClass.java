class TestThread extends Thread{
	Thread t;
	TestThread(){
		super("demo");
		System.out.println("Child"+this);
		//start();
		System.out.println(this.getPriority()+" "+this.getId());
	}
	public void run() {
		try {
			for(int n = 5; n>0; n--) {
				System.out.println("Child Thread "+n);
				Thread.sleep(1000);   // time specified in milli seconds u can also use Thread.sleep(milli,nano)
			}
		}catch(InterruptedException e) {
			System.out.println("Child Interrupted");
		}
		System.out.println("Exiting Child");
	}
}
public class ThreadClass {
public static void main(String[] args) {
	TestThread tt=new TestThread();
	tt.start();
	try {
		for(int n = 5; n>0; n--) {
			System.out.println("Main thread "+n);
			Thread.sleep(1000);   // time specified in milli seconds u can also use Thread.sleep(milli,nano)
			
		}
	}
		catch(InterruptedException e) {
			System.out.println("Main Interrupted");
		}
	System.out.println("Exiting Main");
}
}
