package inter;
interface Showable
{default void show()
	{System.out.println("IN INTERFACE SHOWABLE");
	
	}
 void print();
}
interface Printable
{default void print()
	{System.out.println("IN INTERFACE PRINTABLE");
	}
void show();
}
class hello implements Printable,Showable
{public void show()
	{//System.out.println("SHOW");
	Showable.super.show();
	}
public void print()
	{//System.out.println("PRINT");
	Printable.super.print();
	}
static void disp()
	{System.out.println("Hello Display");
	
	}
}
public class tester {
	public static void main(String[] args)
	{hello obj=new hello();
	obj.show();
	obj.print();
	obj.disp();
	}
}
