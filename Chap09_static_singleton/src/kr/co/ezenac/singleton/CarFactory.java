package kr.co.ezenac.singleton;

public class CarFactory {
//	static int serialNum=1001;
	private CarFactory() {}//생성자 private화
	private static CarFactory instance=new CarFactory();//내부 객체 선언
	public static CarFactory getInstance() {//Carfactory 타입을 리턴받는 정적메소드생성
		if(instance==null)
			instance=new CarFactory();
		return instance;
		}
	
	public Car createCar() {
		Car car=new Car();//객체를 하나 더 생성한 것은 아닌지?
		//정보를 보관하고 공유하고자 하는 클래스(예시의 '회사'클래스)가 한 번의 메모리만 할당하고 그 할당한 메모리에 대해 객체로 관리하기 위함입니다. 
//		serialNum++;
		return car;
	}
//	public int getCarNum() {
//		return serialNum;
//	}

	
}
