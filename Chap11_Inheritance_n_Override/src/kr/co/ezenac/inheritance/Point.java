package kr.co.ezenac.inheritance;

public class Point {

	int x;
	int y;
	public Point() {
		this(0, 0);
	}
	public Point(int x,int y) {
		System.out.println("Point class의 매개변수가 있는 생성자 호출");
		this.x=x;
		this.y=y;
	}
	public String coordinate() {
		String coor=Integer.toString(x)+","+Integer.toString(y);
		return coor;
	}
	
}
