package kr.co.ezenac.templatePattern;

public abstract class Car {
	private void startCar() {
		System.out.println("시동o");
	}
	private void turnOff() {
		System.out.println("시동x");
	}
	protected abstract void drive();
	protected abstract void stop();
	
	public final void run() {
		startCar();
		drive();
		stop();		
		turnOff();
		
	}
}
	
