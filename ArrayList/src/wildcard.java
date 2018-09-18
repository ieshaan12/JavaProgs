import java.util.*;

abstract class shape{
	final double pi=3.14;
	double area;
	abstract void draw();
}
class rect extends shape{
	rect(int l,int b)
	{area=l*b;}
	void draw()
	{System.out.println("Area of Rectangle:"+area);
	}
}
class circle extends shape{
	circle(int r)
	{area=pi*r*r;
	}
	void draw()
	{System.out.println("Area of Circle:"+area);}
}
	
public class wildcard {
	public static void drawshapes(List<? extends shape> lists)
	{
		for(shape s:lists)
		{s.draw();}
	}
	public static void main(String args[])
	{
	List<rect> list1= new ArrayList<rect>();
	list1.add(new rect(3,5));
	List<circle> list2=new ArrayList<circle>();
	list2.add(new circle(2));
	list2.add(new circle(5));
	drawshapes(list1);
	drawshapes(list2);
	}
}
