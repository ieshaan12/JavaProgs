package classes;
class sup{
	int t=10;
	private double r=3;
	void show()
	{System.out.println("In sup's show");
		
	}
	class sub{
		void show()
		{System.out.println("t : "+t);	
		System.out.println("r : "+r);
		}
	}
}

public class NestedClass {
public static void main(String[] args)
{sup a=new sup();
sup.sub b=a.new sub();
b.show();
a.show();
}
}
