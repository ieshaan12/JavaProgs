import java.util.Scanner;

class A implements Runnable{
    public void run(){
        System.out.println("run-a");
    }
}
//class T
enum Month{JAN,FEB,MAR;}
public class Testing {
	static int i=3;static int j=3;
	{System.out.println("hello");}
	static {System.out.println("static");}
	public Testing(){System.out.println("new");}
    public static void main (String[] args) {
       /* A a=new A();
        Thread t=new Thread(a);
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
        Integer c=125;
		int b=125;
		System.out.println(c.equals(b));
		System.out.println(b.equals(c));
		System.out.println(c==b);
	*/
    	/*Integer[][] a1= {{1,2},{3,4,5}};
    	Number[] a2=a1[0];int x=1;
    	System.out.println(a1[0][0]==1);
    	//System.out.println(a2[0]==x);
    	//System.out.println(x instanceof Integer);
    	System.out.println(a1[1][0]>(Integer)a2[0]);*/
		/*Month m1=Month.JAN;
		Month m2=Month.JAN;
		Month m3=Month.FEB;
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
		System.out.println(m1==m3);
		System.out.println(m1.equals(m3));
    	String val="abc";
    	Change(val);
    	System.out.println(val);
    	Testing t=new Testing();
    	new Thread(t).start();
    	new Thread(t).start();*/
    	//Testing t=new Testing();
    	/*int[] a= {21,213};
    	int b=3;int c=5;
    	//Fold.change(a,b,c);
    	System.out.println(a[0]+ " "+b+" "+c);
    	add();
    	String in="1 a 10 . 213 1;23";
    	Scanner s=new Scanner(in);
    	int accum=0;
    	for(int i=0;i<4;i++)
    	{
    		accum+=s.nextInt();
    	}
System.out.println(accum);*/
    	/*int x=3;
    	x*=3+5;
    	int[] arr=new int[5];
    	System.out.println(arr instanceof Object);
    	System.out.print(x);*/
    	Integer i=21;int k=21;
    	System.out.println(i==k);
    	
    }
}
    //public static void add() {
    //	System.out.println(i+j);}
    //}
    //public static void Change(String a) {a="xtz";}
   /* class Fold{
    	static void change(int a[],int b,int c) {a[0]=3;b=2;c=4;}
    }
    public static void add() {
    	System.out.println(i+j);
    }*/