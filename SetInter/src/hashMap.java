import java.util.HashMap;
import java.util.Map;

public class hashMap {
public static void main(String[] args)
{HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(100, null);
hm.put(120,"Bell");
hm.put(80, "Tesla");
hm.put(null, null);
hm.put(102,"Rutherford");
hm.put(102,"Ernst");
for(Map.Entry<Integer, String> m:hm.entrySet())
{System.out.println(m.getKey()+" "+ m.getValue());}
}
}
