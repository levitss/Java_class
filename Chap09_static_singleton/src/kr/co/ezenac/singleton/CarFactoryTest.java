package kr.co.ezenac.singleton;

public class CarFactoryTest {
	//자동차 공장은 유일한 객체이고 이 공장에서 생산괸 자동차는 시리얼 넘버 부여됨
	//맨 처음 1001 이후 1002 1003 부여되도록
	//자동차 클래스는 싱글톤. 자동차 클래스
	
		
	public static void main(String[] args) {
		CarFactory carFactory=CarFactory.getInstance();
		Car bmwix=carFactory.createCar();
		Car bmwi4=carFactory.createCar();
		
		System.out.println(bmwix.getCarNum());
		System.out.println(bmwi4.getCarNum());
		
	}
}
