package kr.co.ezenac.singleton;

public class Car {
	private static int serialNum=1000;//번호 부여받아 소유하고 있는건 car
	
	private int carNum;
	public Car() {
		serialNum++;
		carNum=serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
}
