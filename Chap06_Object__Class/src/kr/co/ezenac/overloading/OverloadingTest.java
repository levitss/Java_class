package kr.co.ezenac.overloading;
class Calc{
	public int add(int num1, int num2) {//모든 메서드는 하나의 기능만.....함수랑 다른점?
		return num1+num2;
	}
	public int add(int num1) {	//overloading 같은 메서드명 매개변수 수와 타입이 다르다 
		return num1+1;
	}
	public double add(double num1, double num2) {
		return num1+num2;
	}
}
public class OverloadingTest {
	public static void main(String[] args) {//메인이 필요한 이유. 시작점 역할
		Calc cal=new Calc();
		System.out.println(cal.add(1));
		System.out.println(cal.add(1,4));
		System.out.println(cal.add(5.22,3.141592));
		
		
	}
	
}
