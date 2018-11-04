class Complex
{double realPart;
double imaginaryPart;
public Complex()
{this.realPart=0;this.imaginaryPart=0;
}
public Complex(double r, double i)
{this.imaginaryPart=i;this.realPart=r;}
public Complex(Double ...c)
{if(c.length==1)
{this.imaginaryPart=0;}
else
{this.imaginaryPart=c[1];}
}
public double getRealPart() {
	return realPart;
}
public void setRealPart(double realPart) {
	this.realPart = realPart;
}
public double getImaginaryPart() {
	return imaginaryPart;
}
public void setImaginaryPart(double imaginaryPart) {
	this.imaginaryPart = imaginaryPart;
}
public Complex add(Complex b)
{Complex a=new Complex();
a.realPart=this.realPart+b.realPart;
a.imaginaryPart=this.imaginaryPart+b.imaginaryPart;
return a;
}
public Complex subtract(Complex b)
{Complex a=new Complex();
a.realPart=this.realPart-b.realPart;
a.imaginaryPart=this.imaginaryPart-b.imaginaryPart;
return a;
}
public Complex multiply(Complex b)
{Complex a=new Complex();
a.realPart=(this.realPart*b.realPart-this.imaginaryPart*b.imaginaryPart);
a.imaginaryPart=(this.realPart*b.imaginaryPart)+this.imaginaryPart*b.realPart;
return a;
}
public Complex divide(Complex b)
{Complex a=new Complex();
double denom=(b.realPart)*(b.realPart)+(b.imaginaryPart*b.imaginaryPart);
a.realPart=(this.realPart*b.realPart+this.imaginaryPart*b.imaginaryPart)/denom;
a.imaginaryPart=(this.imaginaryPart*b.realPart-this.realPart*b.imaginaryPart)/denom;
return a;
}
}
public class q2 {
public static void main(String[] args)
{	
}
}
