package lab3;
public class Complex {
double realPart;
double imaginaryPart;
public Complex()
{this.realPart=0;
this.imaginaryPart=0;
}
public Complex (double realPart, double imaginaryPart)
{this.realPart=realPart;
this.imaginaryPart=imaginaryPart;
}
public Complex(Double ...c)
{if(c.length==1)
	{
	this.realPart=c[0];
	}
else
{this.realPart=c[0];
this.imaginaryPart=c[1];
}
}

public Complex add (Complex otherNumber)
{Complex t=new Complex();
t.realPart=this.realPart+otherNumber.realPart;
t.imaginaryPart=this.imaginaryPart+otherNumber.imaginaryPart;
return t;
}
public Complex multiply (Complex otherNumber)
{Complex t=new Complex();
t.realPart=this.realPart*otherNumber.realPart-this.imaginaryPart*otherNumber.imaginaryPart;
t.imaginaryPart=(this.imaginaryPart*otherNumber.realPart+this.realPart*otherNumber.imaginaryPart);
return t;
}
public Complex divide (Complex otherNumber)
{Complex t=new Complex();
t.realPart=(this.realPart*otherNumber.realPart+this.imaginaryPart*otherNumber.imaginaryPart)/(otherNumber.realPart*otherNumber.realPart+otherNumber.imaginaryPart*otherNumber.imaginaryPart);
t.imaginaryPart=(this.imaginaryPart*otherNumber.realPart-this.realPart*otherNumber.imaginaryPart)/(otherNumber.realPart*otherNumber.realPart+otherNumber.imaginaryPart*otherNumber.imaginaryPart);
return t;
}
public Complex subtract (Complex otherNumber)
{Complex t=new Complex();
t.realPart=this.realPart-otherNumber.realPart;
t.imaginaryPart=this.imaginaryPart-otherNumber.imaginaryPart;
return t;
}
public void setRealPart (double rp)
{this.realPart=rp;
}
public void setImaginaryPart (double img)
{this.imaginaryPart=img;
}
public double getRealPart()
{return this.realPart;
}
public double getImaginaryPart()
{return this.imaginaryPart;
}
}

