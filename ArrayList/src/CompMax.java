
public class CompMax {
public static void main(String[] args)
{System.out.printf("Max of %s,%c and %c is %c, min is %c\n",'s','r','t',maximum('s','r','t'),minimum('s','r','t'));	
}
public static <T extends Comparable<T>> T maximum(T x, T y, T z)
{T max=x;
if(y.compareTo(max)>0)
	max=y;
if(z.compareTo(max)>0)
	max=z;
return max;
}
public static <T extends Comparable<T>> T minimum(T x, T y, T z)
{T max=x;
if(y.compareTo(max)<0)
	max=y;
if(z.compareTo(max)<0)
	max=z;
return max;
}
}
