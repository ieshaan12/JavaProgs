abstract class Worker{
	double salary_rate;
	String name;
	abstract public double computePay();
}
class FullTimeWorker extends Worker{
	int hours_worked;
	FullTimeWorker(String n,double sr, int hw)
	{this.salary_rate=sr;
	this.name=n;
	this.hours_worked=hw;
	}
	public double computePay()
	{return this.hours_worked*this.salary_rate;
	}
}
class HourlyWorker extends Worker{
	int hours_worked;
	HourlyWorker(String n,double sr, int hw)
	{this.salary_rate=sr;
	this.name=n;
	this.hours_worked=hw;
	}
	public double computePay()
	{return this.hours_worked*this.salary_rate;
	}
}

public class q3 {
	public static void main(String[] args)
	{HourlyWorker hw=new HourlyWorker("Ben",50,45);
	FullTimeWorker ftw=new FullTimeWorker("Den",100,200);
	System.out.println(hw.computePay()+" "+ftw.computePay());
	}

}
