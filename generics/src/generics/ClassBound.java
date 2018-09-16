package generics;
class identity<T extends Number>
{T obj;
identity(T obj)
{this.obj=obj;}
public T getObject()
{return this.obj;}
}
public class ClassBound {
public static void main(String[] args)
{identity <Integer> iObj= new identity<Integer>(20051);
System.out.println(iObj.getObject());
identity <Double> dObj=new identity<Double>(210.21);
System.out.println(dObj.getObject());
/*identity <String> sObj=new identity<String>("ASAP");
System.out.println(sObj.getObject());
	*/
}
}
