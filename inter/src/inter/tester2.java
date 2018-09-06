package inter;

interface Show2
{void show2();
	default void show()
	{System.out.println("IN INTERFACE SHOWABLE");
	
	}
	interface Printable2
	{default void print()
		{System.out.println("IN INTERFACE PRINTABLE");
		}
	}
}
class hello2 implements Show2
{public void show()
	{//System.out.println("SHOW");
	Show2.super.show();
	}
public void print()
	{//System.out.println("PRINT");
	}
static void disp()
	{System.out.println("Hello Display");
	}
public void show2()
{System.out.println("In Showable's show2");
}
}
public class tester2 {
	public static void main(String[] args)
	{hello2 obj=new hello2();
	obj.print();
	obj.show();
	hello2.disp();
	obj.show2();
	}

}
