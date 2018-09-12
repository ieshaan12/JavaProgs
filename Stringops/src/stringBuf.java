
public class stringBuf {
public static void main(String[] args)
{StringBuffer s1=new StringBuffer();	//Automatically reserves 16 characters
StringBuffer s2=new StringBuffer(10);				
StringBuffer s3=new StringBuffer("Hello");
int p3=s3.length();
int q3=s3.capacity();
int p1=s1.length();
int q1=s1.capacity();
int p2=s2.length();
int q2=s2.capacity();
System.out.println(p3+" "+q3);
System.out.println(p2+" "+q2);			
System.out.println(p1+" "+q1);

}
}
