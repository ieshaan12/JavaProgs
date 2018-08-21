class Doggie{
	int d;
	String name;
	public void bark()
	{System.out.println("Woof");
	}
	public void intro()
	{System.out.println("My name is "+this.name+".");
	 System.out.println("My id is "+this.d);
	}
}

public class asd {
	public static void main(String args[])
	{Doggie bam=new Doggie();
		bam.d=3;
		bam.name="Lucas";
		bam.bark();
		bam.intro();
		System.out.println("hello");
	}
	
}