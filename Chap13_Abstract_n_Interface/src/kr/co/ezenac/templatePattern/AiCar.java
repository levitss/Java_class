package kr.co.ezenac.templatePattern;

public class AiCar extends Car {
	@Override
	protected void drive() {
		System.out.println("autodrive");
	}
	@Override
	protected void stop() {
		System.out.println("autobreak");
	}
}
