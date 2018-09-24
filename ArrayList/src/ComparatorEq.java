import java.util.*;
class acco implements Comparator<acco>
{
	int acc;
	String name;
	float amt;
	acco(int acc,String name,float amt)
	{this.acc=acc;
	this.name=name;
	this.amt=amt;
	}
	public boolean equals(acco a1)
	{if(a1==null)
		return false;
	if(this.acc!=a1.acc)
		return false;
	if(this.amt!=a1.amt)
		return false;
	if(this.name!=a1.name)
		return false;
	return true;
	}
	public int compare(acco a1, acco a2)
	{//do stuff;
	return 0;
	}
}
public class ComparatorEq {
public static void main(String[] args)
{List<acco> a1=new ArrayList<acco>();
a1.add(new acco(123,"Matt",40001));
a1.add(new acco(112,"Andrew",5000));
a1.add(new acco(112,"Andrew",5000));
a1.add(new acco(145,"Gilbert",6000));
System.out.println(a1.get(0).equals(a1.get(1)));
System.out.println(a1.get(1).equals(a1.get(2)));
}
}
