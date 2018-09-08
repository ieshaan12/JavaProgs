class GcdFinder
{ int gcd;
void finder(int a, int b)
{int big = 0,small=0;
	if(a>b)
	{big=a;small=b;
	}
	else if(a<b)
	{big=b;
	small=a;
	}
	else
	{gcd= a;
	}
	//System.out.println(big+" "+small);
	if(big%small==0)
	{gcd= small;}
	else if(big%small!=0)
	{int divisor=big%small;
		finder(small,divisor);	
	}
	else
	{
	gcd= 1;
	}
}
}
public class EuclidAlgo {
public static void main(String[] args)
	{GcdFinder ob=new GcdFinder();
	ob.finder(273,91);
	System.out.println(ob.gcd);
	}
}
