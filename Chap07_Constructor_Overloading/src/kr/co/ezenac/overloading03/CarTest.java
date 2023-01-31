package kr.co.ezenac.overloading03;

public class CarTest {
	public static void main(String[] args) {
		Car car=new Car();
		Car car2=new Car("Green","Manual",1);
		
		System.out.println(car.toString());
		System.out.println(car2.toString());		
	}
}
