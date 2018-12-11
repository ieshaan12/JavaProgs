enum Months{
	
	Jan(1),Feb(2),Mar(3),Apr(4),May(5),Jun(6),Jul(7),Aug(8),Sep(9),Oct(10),Nov(11),Dec(12);
	
	private int value;
	
	Months(int val){
		this.value=val;
	}
	
	public String toString() {
		return Integer.toString(value);
	}
}

public class Testrecord {
	Months m;
Testrecord(Months m)
{this.m=m;
}
public void Monthdesc() {
	switch(this.m)
	{
	case Jan:System.out.println("It is January");break;
	case Feb:System.out.println("It is February");break;
	case Mar:System.out.println("It is March");break;
	case Apr:System.out.println("It is April");break;
	case May:System.out.println("It is May");break;
	case Jun:System.out.println("It is June");break;
	case Jul:System.out.println("It is July");break;
	case Aug:System.out.println("It is August");break;
	case Sep:System.out.println("It is September");break;
	case Oct:System.out.println("It is October");break;
	case Nov:System.out.println("It is November");break;
	case Dec:System.out.println("It is December");break;
	}
}
public static void main(String[] args)
{Testrecord t=new Testrecord(Months.valueOf("May"));
//Months s=new Months(2);
t.Monthdesc();
Testrecord k=new Testrecord(Months.valueOf("Jan"));
System.out.println(t.m);
System.out.println(k.m.ordinal());
System.out.println(Months.May);
}
}
