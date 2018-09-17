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

}
}
