class Account{
	int acc;
	String name;
	float amount;
	Account(int act,String aname)
	{acc=act;
	name=aname;
	}
	void update(int act,String aname,float amt)
	{acc=act;
	name=aname;
	amount=amt;
	}
	void display()
	{System.out.println(acc+" "+name+" "+amount);
	}
	void insert(int acc, String name,float amount)
	{this.acc=acc;
	this.name=name;
	this.amount=amount;
	}
}
public class fds {
	public static void main(String[] args) {
		Account a1=new Account(Integer.parseInt(args[0]),args[1]);
		a1.display();
		a1.update(Integer.parseInt(args[2]), args[3], Integer.parseInt(args[4]));
		a1.display();
		
		Account[] a=new Account[3];
		for(int i=0;i<3;i++)
		{a[i]=new Account(i,null);
		a[i].insert(Integer.parseInt(args[3*i]),args[3*i+1],Float.parseFloat(args[3*i+2]));
		a[i].display();
		}
	}
}
