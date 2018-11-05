class Employee{
	String name;
	double salary;
	Employee(String n, double s)
	{this.name=n;
	this.salary=s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Name: "+this.name+" Salary: "+this.salary;
	}
}
class Manager extends Employee
{String dept;
Manager(String n,double s, String d)
{super(n, s);
this.dept=d;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String toString()
{return "Name: "+this.name+" Salary: "+this.salary+" Dept: "+this.dept;
}
public class q2 {

}
