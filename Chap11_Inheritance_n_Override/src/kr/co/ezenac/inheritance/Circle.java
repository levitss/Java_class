package kr.co.ezenac.inheritance;

public class Circle extends Shape {
	int radius;
	Point center;
	
	public Circle() {
		//자식 클래스가 만들어지기 위해서는 부모 클래스도 만들어져야함==super()(부모클래스의 기본생성자)가 생략됨
		this(new Point(0,0),100);//has a 관계 구축//point 생성자에 00입력
	}
	public Circle(Point center, int radius) {
		System.out.println("circle 클래스의 매개변수가 있는 생성자 호출");
		this.center=center;
		this.radius=radius;
	} 
	@Override
	public void draw() {
		System.out.println(this.color);
		System.out.println(this.center.x+" "+this.center.y+" "+this.radius);
		

	}
}
