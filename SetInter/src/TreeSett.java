import java.util.*;
public class TreeSett {
public static void main(String[] args)
{TreeSet<Integer> t= new TreeSet<Integer>();
t.add(23);
t.add(2321);
t.add(212);
t.add(23);// Redundant Not Taken in Set Interfaces
Iterator<Integer> itr=t.iterator();//Ascending Order
while(itr.hasNext())
{System.out.println(itr.next());}
HashSet<Integer> a= new HashSet<Integer>();
a.add(23);
a.add(2321);
a.add(212);
a.add(23);// Redundant Not Taken in Set Interfaces
Iterator<Integer> itr2=a.iterator();//According to HASH Code
while(itr2.hasNext())
{System.out.println(itr2.next());}
}
}
