import java.util.*;

public class wildcard2 {
public static void main(String[] args)
{List<Integer> l1=Arrays.asList(1,2,3);
List<Number> l2=Arrays.asList(1.1,2,3,4);
List<Double> l3=Arrays.asList(23.2,3.2,321.2);
List<String> l4=Arrays.asList("SA","SAP","SAPM");
	printlist(l1);
	printlist(l2);
	printlist(l3);
	printlist(l4);
}
private static void printlist(List<?> list)
{System.out.println(list);
}
}
