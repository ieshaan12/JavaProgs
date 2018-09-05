package lab3;
import java.util.*;
public class Complexdemo {
public static void main(String[] args)
{Scanner in=new Scanner(System.in);
System.out.println("Input for c1:Real:");
double a=in.nextDouble();
System.out.println("Input for c1: Imaginary:");
double b=in.nextDouble();
System.out.println("Input for c2: Real:");
double x=in.nextDouble();
System.out.println("Input for c2: Imaginary:");
double y=in.nextDouble();
Complex c1=new Complex(a,b);
Complex c2=new Complex(x,y);
Complex c3=new Complex();
c3=c1.add(c2);
System.out.println(c3.getRealPart()+" "+c3.getImaginaryPart());
c3=c1.subtract(c2);
System.out.println(c3.getRealPart()+" "+c3.getImaginaryPart());
c3=c1.multiply(c2);
System.out.println(c3.getRealPart()+" "+c3.getImaginaryPart());
c3=c1.divide(c2);
System.out.println(c3.getRealPart()+" "+c3.getImaginaryPart());
}
}
