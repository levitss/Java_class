package kr.co.ezenac.overloading;
//method overloading
public class Adder {
	public int add(int a,int b) {
		System.out.println("add(int a,int b)");
		return a+b;
	}
//	public int add(int x,int y) 매개변수명이 달라도 같은걸로 취급됨. (영향을 안줌)
//	public long add(int q,int u) 리턴 타입이 달라도 같은걸로 취급됨.
	public long add(int a,long b) {//long으로 형변환되어 리턴
		System.out.println("add(int a,long b)");
		return a+b;
	}
	public double add(double a, double b) {
		System.out.println("add(double a, double b)");
		return a+b;
	}
	

}
