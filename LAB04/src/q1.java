import java.io.IOException;
import java.util.StringTokenizer;

class Name {
 private String fname; // First Name
 private String mname; // Middle Name
 public String getFname() {
	return fname;
}
public String getMname() {
	return mname;
}
public String getLname() {
	return lname;
}
private String lname; // Last Name
 Name(String name) {
	 if(name.contains(","))
	 {StringTokenizer st=new StringTokenizer(name,",");
	 fname=st.nextToken();
	 mname=st.nextToken();
	 lname=st.nextToken();
	 }
	 else if(name.contains(";"))
	 {StringTokenizer st=new StringTokenizer(name,";");
	 lname=st.nextToken();
	 mname=st.nextToken();
	 fname=st.nextToken();
	 }
 	}
	 public String getName() {
		 return (this.getFname()+" "+this.getMname()+" "+this.getLname());
	 }
	 public String toString() {
		 return (this.getFname()+""+this.getMname()+""+this.getLname());
	 }
 } // End of class Name.
class Student {
	 private Name name; // name of student
	 private int age;// age of student
	 Student(Name n,int a)
	 {this.name=n;this.age=a;
	 }
	public Name getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	 public String toString()
	 {return this.name.getFname()+" "+this.name.getMname()+" "+this.name.getLname();
	 }
	}// End of Student class
class StudentList {
	 public static Student[] list = new Student[10]; // list of students
	 public static int count =0; // count of students added in the list
	 public static void addStudent(Student std) {
	 if(count>= 20) return; // if count is already 20 or more then return
	 list[count] = std;
	 count++;
	 }
	 public static Student[] getStudentsWithAge(int age) {
	 /* This method returns all the students whose age is equal to age
	 parameter of this method. If no such student is found then it
	 returns null. */
	 // Write Your Code From Here
	int c=0;
	for(Student i:list)
	{if(i.getAge()==age)
		{c++;}
	}
	Student[] stu= new Student[c];
	int k=0;
	for(Student t:list)
	{if(t.getAge()==age)
		{stu[k]=t;k++;}
	}
	return stu;
	 }
	 public static Student[] getStudentsWithLastName(String lastName) {
	 /* This method returns all the students whose last name attribute
	 value matches with lastName parameter of this method. If no such
	 students is found then it returns null. */
	 // Write Your Code From Here
		 int c=0;
			for(Student i:list)
			{if(i.getName().getLname().equals(lastName))
				{c++;}
			}
			int k=0;
			Student[] stu= new Student[c];
			for(Student t:list)
			{if(t.getName().getLname().equals(lastName))
				{stu[k]=t;
				k++;}
			}
		return stu;
	 }
	 public static Student[] getStudentsInRange(int minAge, int maxAge) {
	 /* This method returns all the students whose age falls between minAge
	 and maxAge (both parameters inclusive) */
	 // Write Your Code From Here
		 int c=0;
			for(Student i:list)
			{if(i.getAge()>minAge && i.getAge()<maxAge)
				{c++;}
			}
			Student[] stu= new Student[c];
			int k=0;
			for(Student t:list)
			{if(t.getAge()>minAge && t.getAge()<maxAge)
				{stu[k]=t;k++;}
			}
			return stu;
	 }
	}// End of class StudentList
public class q1 {
	//public static Student readStudent() throws IOException{
	/* This method reads the student details and returns the Student instance.
	Values to be read from System.in are:
	1. First name of Student, 2. Middle name of student, 3. Last name of
	 Student, 4. Name format (1 for comma(,) separated and 2 for semicolon
	separated), 5. age of student
	*/
	//} // End of readStudent() Method
	//public static void main(String args[]) throws IOException{
	/* 1. Write java code for reading details of 10 students and add them
	in the static list ofStudentListclass.*/
	/* 2. Write java code for displaying the all the students with age 20 from
	static list field of StudentList class*/
	/* 3. Write java code for displaying the student details for all students
	having last name “Sharma” from static list of StudentList class*/
	 /* 4. Write java code for displaying all the students whose age falls in
	 the range minAge = 16 and maxAge = 20 from static list of StudentList
	 class*/
	//}// End of main() Method
	//}// End of Test class
	public static void main(String[] args)
	{
	}
		
	}
	

