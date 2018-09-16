import java.util.ArrayList;
import java.util.Collections;

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
	
}
}
