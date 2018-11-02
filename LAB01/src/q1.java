
public class q1 {
public static void main(String[] args)
{
	int a=1,b=1,c;
    float s=2;
    for(int i=0;i<18;i++)
    {c=a+b;
    a=b;
    b=c;
    System.out.print(c+" ");
    s=s+c;
}
System.out.println("\n"+s/20);
}
}
