
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
s3.append(" World");
s3.ensureCapacity(24); //Either the argument or original capacity *2 + 2, whichever is greater
System.out.println(s3.length()+" "+s3.capacity());
System.out.println(s3);
StringBuffer s4= new StringBuffer("Hey");
System.out.println(s4.capacity());
s4.append(", I am Ieshaan");
System.out.println(s4.capacity());
s4.append(". Nice to meet you");
System.out.println(s4.capacity());
}
}
