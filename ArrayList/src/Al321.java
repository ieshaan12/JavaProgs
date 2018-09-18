import java.util.*;

public class Al321 {
public static void main(String[] args)
{ArrayList<Integer> a1=new ArrayList<Integer>();
a1.add(20);
a1.add(40);
ArrayList<Integer> a2=new ArrayList<Integer>();
a2.add(80);
a2.add(160);
a1.addAll(a2);
Collections.sort(a1);
System.out.println(a1);
System.out.println(a1.get(3));
ListIterator<Integer> itr=a1.listIterator();
while(itr.hasNext())
	System.out.println(itr.next());
while(itr.hasPrevious())
	System.out.println(itr.previous());
ArrayList g=new ArrayList();
g.add("HELL");
g.add(" AND ");
g.add("HEAVEN");
g.add("3");
String s[]=new String[4];
///for(int i=0;i<4;i++)
//	s[i]=(String)g.get(i);
System.out.println(g);
//System.out.println(Arrays.toString(s));
/*
 Type-Safety: We can hold only a single type of objects in generics.
  			  It doesn't allow to store other objects.
 Type Casting: There is no need to typecast the object.
 Compile Time Checking: It is checked at compile time so problem will 
 						not occur at runtime.
 */
}
}
