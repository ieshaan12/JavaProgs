import java.io.*;
import java.util.*;
public class q1 {
	public static void main(String[] args) throws IOException
	{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
	for(int i=0;i<10;i++)
		{int a= Integer.parseInt(br.readLine());
		sum=sum+a;
		}
	System.out.println(sum);
	}

}
