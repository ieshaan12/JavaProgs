import java.util.*;
class TaxOnSalary{
	double salary;
	boolean isPanSubmitted;
	public double getSalary() {
		return salary;
	}
	public boolean isPanSubmitted() {
		return isPanSubmitted;
	}
	TaxOnSalary()
	{this.isPanSubmitted=false;
	this.salary=0.0;
	}
	TaxOnSalary(boolean ips)
	{this.isPanSubmitted=ips;
	this.salary=1000.0;	
	}
	public void inputSalary()
	{Scanner sc=new Scanner(System.in);
		this.salary=sc.nextDouble();
		sc.close();
	}
	public double calculateTax()
	{if(this.salary<180000 && this.isPanSubmitted==true)
		return 0.0;
	else if(this.salary<180000 && this.isPanSubmitted==false)
		return 0.05*this.salary;
	else if(this.salary<500000)
		return this.salary*0.1;
	else if(this.salary<1000000)
		return this.salary*0.2;
	else
		return this.salary*0.3;
		
	}
}
public class q4 {

}
