package kr.co.ezenac.templatePattern;

public class ManualCar extends Car {
	@Override
	protected void drive() {
		System.out.println("직접 핸들로 운전");
	}@Override
	protected void stop() {
		System.out.println("브레이크로 정지");
	}
	
	
}
