package inter;
interface Printable2{
	default void print()
	{System.out.println("in printable");
	}
		interface Showable{
		void show();
	}
}
class inter2{
	void pr()
	{System.out.println("Inside class inter2's pr");
	}
	interface Printable3
	{void print2();
	}
}
class trial extends inter2 implements Printable2,Printable2.Showable,inter2.Printable3
{public void print()
	{System.out.println("In Trial, implementing Printable2's print");}
public void show()
	{System.out.println("In Trial, implementing Printable2's Showable's show");
	}
public void print2()
{System.out.println("In Trial, implementing inter2's Printable3's print2");
}
}
public class Nestedinterface {
public static void main(String[] args)
{trial t=new trial();
t.print();	
t.show();
t.pr();
t.print2();

}
}
