import java.util.Comparator;
import java.util.PriorityQueue;

class Account
{int acc;
String name;
float money;
Account(int a,String b, float c)
{this.acc=a;
this.name=b;
this.money=c;
}
}
class AccCmp implements Comparator<Account>
{public int compare(Account a1,Account a2)
	{if(a1.money==a2.money)
		return 0;
	else if(a1.money<a2.money)
		return -1;
	else
		return 1;
	}
	
}
public class PrQueue {
public static void main(String[] args)
{PriorityQueue<Account> a1=new PriorityQueue<Account>(5,new AccCmp());
a1.add(new Account(123,"A",8.1f));
a1.add(new Account(122,"B",8.4f));
a1.add(new Account(121,"C",8.3f));
System.out.println("Priority Order");
while(!a1.isEmpty())
{System.out.println(a1.poll().acc);}
}
}
