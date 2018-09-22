import java.util.*;
class Account implements Comparable<Account>
{
	int acc;
	String name;
	float amt;
	Account(int acc,String name,float amt)
	{this.acc=acc;
	this.name=name;
	this.amt=amt;
	}
	public int compareTo(Account ac)
	{if(amt==ac.amt)
		return 0;
	else if(amt>ac.amt)
		return 1;
	else
		return -1;		
	}
	public String toString()
	{return ("Acc No:"+acc+" Name:"+name+" Amount:"+amt);
	}
}
public class CompIF {
public static void main(String[] args)
{
	List<Account> a1=new ArrayList<Account>();
	a1.add(new Account(123,"Matt",40001));
	a1.add(new Account(112,"Andrew",5000));
	a1.add(new Account(145,"Gilbert",6000));
	Collections.sort(a1);//Sorts in ascending order of amount
	for(Account a:a1)
	System.out.println(a);
}
}
