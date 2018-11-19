
public class userdef {
public static void main(String[] args)
{
	try {
		NumberFormatException e=new NumberFormatException("Outer");
		e.initCause(new ArithmeticException("Inner"));
		throw e;
	}
	catch(NumberFormatException e) {
		System.out.println(e);
		System.out.println(e.getCause());
		System.out.println(e.getMessage());
		}
}
}
