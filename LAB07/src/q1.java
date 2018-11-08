
public class q1 {
	public Circle getCircle(int radius) {
		// Write one line statement that returns object of Circle
		 // by writing Anonymous inner class.
		Circle c=new Circle(radius);
		return c;
		}
		public static void main(String[] args) {
		q1 p = new q1();
		Circle w = p.getCircle(	10);
		 // The output here should give correct value of area
		 // of the circle.
		System.out.println(w.area());
		}
		}
		class Circle {
		private int rad;
		public Circle(int radius) { rad = radius; }
		public double area() { return Math.PI*rad*rad; }
}
