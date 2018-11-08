interface Movable{
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
}
class MovablePoint implements Movable{
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	MovablePoint(int x1,int y1,int xs,int ys)
	{this.x=x1;
	this.y=y1;
	this.xSpeed=xs;
	this.ySpeed=ys;
	}

	public void moveUp() {
		y+=this.ySpeed;
	}
	public void moveDown() {
		y-=this.ySpeed;
	}
	public void moveLeft() {
		x-=this.xSpeed;
	}
	public void moveRight() {
		x+=this.xSpeed;
	}
	public String toString() {
		return "X: "+x+" Y: "+y;
	}
}
class MovableCircle implements Movable{
	int radius;
	MovablePoint centre;
	MovableCircle(int x1,int y1,int xs,int ys,int r)
	{centre=new MovablePoint(x1,y1,xs,ys);
	radius=r;
	}
	public void moveUp() {
		centre.y+=this.centre.ySpeed;
	}
	public void moveDown() {
		centre.y-=this.centre.ySpeed;
	}
	public void moveLeft() {
		centre.x-=this.centre.xSpeed;;
	}
	public void moveRight() {
		centre.x+=this.centre.xSpeed;
	}
	public String toString() {
		return "X(Centre): "+centre.x+" Y(Centre): "+centre.y;
	}
}
public class q1 {
public static void main(String[] args) {
	Movable m1 = new MovablePoint(5, 6, 10, 10); // upcast
	System.out.println(m1);
	m1.moveLeft();
	System.out.println(m1);
	Movable m2 = new MovableCircle(2, 1, 2, 2, 20); // upcast
	System.out.println(m2);
	m2.moveRight();
	System.out.println(m2);
}
}
