package kr.co.ezenac.singleton;

public class sam2 {
	private static int serialNum1=1000;
	private sam2() {}
	private static sam2 instance=new sam2();
	public static sam2 getinstance() {
		if(instance==null)
			instance=new sam2();
		return instance;
	}
	public void createCar() {
		serialNum1++;
		
	}
	public int getNum() {
		return serialNum1;
	}
}
