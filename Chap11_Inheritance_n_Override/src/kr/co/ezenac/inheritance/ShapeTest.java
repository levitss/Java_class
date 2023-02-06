package kr.co.ezenac.inheritance;

public class ShapeTest {
	public static void main(String[] args) {
//		Circle c=new Circle();
//		c.draw();
//		System.out.println();
//		Circle c2=new Circle(new Point(10, 100), 50);
//		c2.draw();
		Triangle tri=new Triangle();
		Triangle tri2=new Triangle(new Point(50, 50), new Point(), new Point(20,20));
		tri2.draw();
//		Triangle tri3=new Triangle(new Point[] {new Point(1,1),new Point(2,2),new Point(3,3)});
		
		
		Point []po4=new Point[] {new Point(1,1),new Point(2,2),new Point(3,3)};
		
		Triangle tri4=new Triangle(po4);
		tri4.draw();
		
	}
}
