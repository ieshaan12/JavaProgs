import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class BankIO {
	public static void readFile(String filename, Bank bank)
	{
		Scanner sc=null,t=null;
	try {
	sc=new Scanner(new FileInputStream(filename));
	t=new Scanner(new FileInputStream(filename));
	}
	catch(FileNotFoundException e){
		System.out.println("File Not Found");
		System.exit(0);
	}
	int i=0;
	while(t.hasNextLine())
	{/*String line=sc.nextLine();
	System.out.println(line);*/
	//t.nextLine();
	//double bal=readAccount(sc).getBalance();
	//int acc=readAccount(sc).getAccountNumber();
	//BankAccount ba=new BankAccount(bal,acc);
	//System.out.println(ba);
	//bank.add(ba);
	i++;
	System.out.println(t.nextInt()+" "+t.nextDouble());
	}
	System.out.println(i);
	sc.close();
	}
	public static BankAccount readAccount(Scanner in) {
		StringTokenizer l=new StringTokenizer(in.nextLine());
		int acc=Integer.parseInt((String)l.nextElement());
		double bal=Double.parseDouble((String)l.nextElement());
		//System.out.println(acc+" "+bal);
		BankAccount t=new BankAccount(bal,acc);
		return t;
		
	}
	public static void main(String[] args) {
		Bank t=new Bank(50);
		final String f="accounts.txt";
		readFile(f,t);
	}
}
