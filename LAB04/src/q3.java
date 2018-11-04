import java.util.*;

class Test
{String str;
public String[] Split()
{StringTokenizer st=new StringTokenizer(this.str,"# ");
int t=st.countTokens();
String[] tokens=new String[t];
int i=0;
while(st.hasMoreTokens())
{tokens[i]=st.nextToken();
i++;
}
return tokens;
}
public String[] UniqueLabels(String words[])
{ArrayList<String> al=new ArrayList<String>();
	for(int i=0;i<words.length;i++)
	{if(!(al.contains(words[i].toLowerCase())))
			{al.add(words[i].toLowerCase());}
	}
	int t=al.size();
	String[] s=new String[t];
	Iterator<String> itr=al.iterator();int k=0;
	while(itr.hasNext())
	{String m=itr.next();
	s[k]=m;k++;
	}
	return s;
}
/*public String[] Count(String words[], String labels[])
{String[] 
	UniqueLabels();
}*/
}
public class q3 {
public static void main(String[] args)
{String st=new String("abc def# def ghi#abc def#ABC def#");
Test t=new Test();
t.str=st;
String[] s=new String[t.Split().length];
s=t.Split();
/*for(String i:s)
{System.out.println(i);
}*/
String[] s2=new String[t.UniqueLabels(s).length];
s2=t.UniqueLabels(s);
for(String i:s2)
{System.out.println(i);
}
}
}