package generics;
class Identity<T>{
	T obj;
	Identity(T obj)
	{this.obj=obj;}
	public T getObject()
	{return this.obj;}	
}
class ID{
	public<T> void printObject(T obj)
	{System.out.println(obj);}
}
public class GenericClass {
public static void main(String[] args)
{Identity <Long> number= new Identity<Long>(9999955555L);
System.out.println(number.getObject());
Identity <String> name=new Identity<String>("Ankit");
System.out.println(name.getObject());
ID i1,i2;
i1=new ID();
i2=new ID();
i1.printObject(20001);
i2.printObject("HEY");
}
}
