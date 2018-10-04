class Bound<T extends A &B>
{private T objref;
public Bound(T obj)
{this.objref=obj;
}
public void doRuntest()
{this.objref.disp();
}
}
interface B
{public void disp();
}
class A implements B
{public void disp()
	{System.out.println("Inside A");
}
}
class C implements B
{public void disp()
	{System.out.println("Inside C");
}
}
public class old {
	public static void main(String[] args)
	{
		Bound<A> e=new Bound<A>(new A());
		e.doRuntest();
}

}
