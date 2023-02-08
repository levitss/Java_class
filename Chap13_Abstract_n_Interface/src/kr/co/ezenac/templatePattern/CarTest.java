package kr.co.ezenac.templatePattern;

public class CarTest {
	public static void main(String[] args) {
		Car dlCar=new AiCar();
		dlCar.run();
		System.out.println();
		Car manualCar=new ManualCar();
		manualCar.run();
	}
}
