
public class q4 {
public static void main(String[] args)
{double sumR=0.0;
double sumL=0.0;
long l=50000;
for(float i=1;i<l;i++)
{sumR=sumR+1/i;
}
for(float j=l;j>0;j--)
{sumL=sumL+1/j;
}
System.out.println(sumL+" "+sumR);
}
}
