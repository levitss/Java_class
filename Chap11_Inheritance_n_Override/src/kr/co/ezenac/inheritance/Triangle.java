package kr.co.ezenac.inheritance;

import java.util.ArrayList;

public class Triangle extends Shape {
//	int height;
//	int base;
//	Point point;
	//point array를 만들어 point 멤버변수.
	Point [] point;//객체 배열 각 point 객체는 매개변수로 두 int를 가짐...
	
//	00 5050 100100
	public Triangle() {
		this(new Point(0, 0),new Point(50, 50),new Point(100, 100));
	}
	public Triangle(Point point, Point point2, Point point3) {//변수 6개를 넣는 대신 2개씩 3뭉치를 넣음
		System.out.println("매개변수 3개 있는 생성자 호출");
		this.point=new Point[] {point,point2,point3};
		
	}
	public Triangle(Point[] point) {
		System.out.println("triangle의 매개변수 point 배열 생성자 호출");
		this.point=point;
	}
	
	@Override
	public void draw() {
//		System.out.println("point1:"+this.point[0].x+this.point[0].y);
//		System.out.println("point2:"+this.point[1].x+this.point[1].y);
//		
		for(int i=0; i<point.length;i++) {
			System.out.println("point2:"+this.point[i].x+this.point[i].y);	
		}
		
		
	}
	
	
		
}
