package kr.co.ezenac.genericmethod;

public class Point <T,V>{
	/*
	 * 두 점을 기준으로 사각형을 만들어 사각형의 너비를 구하는 메서드
	 * 두 점이 정수일수도 있고 실수일수도 있으니 제네릭타입
	 */
	T x;
	V y;
	public Point(T x, V y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
	
	
	
	public T getX() {
		return x;
	}



	public V getY() {
		return y;
	}



}
