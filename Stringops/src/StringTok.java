import java.util.StringTokenizer;

public class StringTok {
public static void main(String[] main)
{StringTokenizer st=new StringTokenizer("Hello, world, I am Ieshaan",",| ",true);
while(st.hasMoreTokens())
{System.out.println(st.nextToken());
}

	
}
}
