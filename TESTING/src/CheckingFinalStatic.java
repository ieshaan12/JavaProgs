/*This class is made to check the usage of final in various objects
 * Also checking bufferedreader 
 * And Arrays
 * 
 */
//import java.util.*;
import java.io.*;
import java.util.Arrays;
public class CheckingFinalStatic {
	static final int b;
	static {b=30;}
public static void main(String[] args) throws IOException
{ final int a;
a=30;
System.out.println(a);
System.out.println(CheckingFinalStatic.b);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//int c;
//c=Integer.parseInt(br.readLine());
//System.out.println(c);
final int[] d= {23,123,55,334,0};
int[] e=d;
int[] f= {23,123,55,334,0};

System.out.println(Arrays.equals(d, f));
System.out.println(Arrays.toString(d));
System.out.println(Arrays.toString(e));
System.out.println(Arrays.toString(f));
Object[] t= {d};
Object[] u= {f};
System.out.println(Arrays.toString(t));
System.out.println(Arrays.toString(u));
System.out.println(Arrays.deepEquals(t, u));

for(int i=0;i<d.length;i++)
	{d[i]=d[i]*10;
	}
System.out.println(Arrays.toString(d));
Arrays.sort(d);
System.out.println(Arrays.toString(d));
int A[][]= new int[3][];
A[0]=new int[4];
A[1]=new int[3];
A[2]=new int[5];
for(int i=0;i<A.length;i++)
	{for(int j=0;j<A[i].length;j++)
		{A[i][j]=i*10+j+1;}
	}
for(int i=0;i<A.length;i++)
{for(int j=0;j<A[i].length;j++)
	{System.out.print(A[i][j]+" ");}
System.out.println();
}

}
}
