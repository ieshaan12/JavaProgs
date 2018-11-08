import java.util.*;

class Account {
private long acctNumber;
private double balance;
private String name;
/*Complete the Account class by adding proper constructor,
accessor method and mutator method as required. Override
toSring() method to display account details.
*/
//Write your code here
Account(long acc, double bal, String n){
	this.acctNumber=acc;
	this.balance=bal;
	this.name=n;
}
public long getAcctNumber() {
	return acctNumber;
}
public void setAcctNumber(long acctNumber) {
	this.acctNumber = acctNumber;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String toString(){
	return "Account Number: "+acctNumber+"\nBalance: "+balance+"\nName: "+name;
}
}
class Bank {
private ArrayList<Account>accts;
int maxActive;
Bank()
{accts=new ArrayList<Account>();
maxActive=0;
}
public void addAccount (Account newone) {
accts.add(newone);
}
public boolean removeAccount (long acctnum) {
	ListIterator itr=accts.listIterator();int f=0;
	Account t=null;
	while(itr.hasNext())
	{Account e=(Account)itr.next();
	if(e.getAcctNumber()==acctnum) {
		f=1;t=e;break;
	}
	}
	if(f==0)
	{return false;}
	accts.remove(t);
	return true;
}
	
public double deposit(long acctnum, double amount) {
	ListIterator itr=accts.listIterator();int f=0;
	while(itr.hasNext())
	{Account e=(Account)itr.next();
	if(e.getAcctNumber()==acctnum) {
		e.setBalance(e.getBalance()+amount);f=1;break;
	}
	}
	if(f==0)
		return -1;
	return 0;
	}
public double withdraw(long acctnum, double amount) {
/* Write the code for withdrawing specified amount from the
account, return -1 if insufficient balance or account does
not exist*/
	ListIterator itr=accts.listIterator();int f=0;
	while(itr.hasNext())
	{Account e=(Account)itr.next();
	if(e.getAcctNumber()==acctnum) {
		f=1;
		if(e.getBalance()<amount)
			return -1;
		else {
			e.setBalance(e.getBalance()-amount);
		}
	}
}
	if(f==0)
	{return -1;}
	return 0;
//override toString() method to display details of all the
//accounts in bank
}
public String toString()
{StringBuffer sb=new StringBuffer("");
ListIterator itr=accts.listIterator();int f=0;
while(itr.hasNext())
{Account e=(Account)itr.next();
sb.append("AccountNumber: "+e.getAcctNumber()+",Balance: "+e.getBalance()+",Name:"+e.getName()+"\n");
}
return sb.toString();

}
}

public class q2 {
public static void main(String[] args) {
	Account a1=new Account(1234, 40000, "Ieshaan");
	Account a2=new Account(1235,30000,"Madyson");
	Bank b=new Bank();
	b.addAccount(a2);
	b.addAccount(a1);
	System.out.println(a1);
	System.out.println(a2);
}
}
