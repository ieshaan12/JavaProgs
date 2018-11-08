class Outer
{private int i=0;
Inner in=new Inner();
void get() {
	System.out.println(i);
}
void getI()
{System.out.println(in.i);
}
class Inner{
	private int i=1;
	void get()
	{System.out.println(i);
	}
	void getO() {
		System.out.println(Outer.this.i);
	}
}
}
public class q2 {
public static void main(String[] args)
{Outer o=new Outer();
Outer.Inner i=o.new Inner();
Outer.Inner i1=new Outer().new Inner();
o.get();
o.getI();
i.get();
i.getO();
}
}
