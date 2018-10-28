interface Printable{
	/*default void print() {
		System.out.println("PrintP");
	}*/
	default void show() {
		System.out.println("ShowP");
	}
	
	void print();	
}
interface Showable{
default void show() {
	System.out.println("ShowS");
}
void print();
}
class T implements Printable,Showable{
	public void show()
	{Printable.super.show();
	Showable.super.show();
		System.out.println("HelloST");}
	public void print() {
		System.out.println("HelloPT");
	}
}
public class InterfaceClass {
	public static void main(String[] args)
	{T t=new T();
	t.show();
	t.print();
	
		
	}
}
