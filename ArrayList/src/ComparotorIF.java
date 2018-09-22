import java.util.*;

class Account2{
	int acc;
	String name;
	float amt;
	Account2(int acc,String name,float amt)
	{this.acc=acc;
	this.name=name;
	this.amt=amt;
	}
	public String toString()//Overloads println command
	{return ("Acc No:"+acc+" Name:"+name+" Amount:"+amt);
	}
}
class AmtCmp implements Comparator<Account2>
{public int compare(Account2 a1, Account2 a2)
	{if(a1.amt==a2.amt)
		return 0;
	else if(a1.amt>a2.amt)
		return 1;
	else
		return -1;
	}
}
class AccCmp implements Comparator<Account2>
{public int compare(Account2 a1, Account2 a2)
	{if(a1.acc==a2.acc)
		return 0;
	else if(a1.acc>a2.acc)
		return 1;
	else
		return -1;
	}
	
}
public class ComparotorIF {
public static void main(String[] args)
{List<Account2> a1=new ArrayList<Account2>();
a1.add(new Account2(123,"Matt",40001));
a1.add(new Account2(112,"Andrew",5000));
a1.add(new Account2(145,"Gilbert",6000));

System.out.println("Comarison on Account");
Collections.sort(a1,new AmtCmp());
for(Account2 a:a1)
	System.out.println(a);
System.out.println("Comarison on Account");
Collections.sort(a1,new AccCmp());
for(Account2 a:a1)
	System.out.println(a);

}
}