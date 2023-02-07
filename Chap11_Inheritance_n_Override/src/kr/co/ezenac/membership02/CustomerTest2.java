package kr.co.ezenac.membership02;

public class CustomerTest2 {
	public static void main(String[] args) {
		Customer cm1=new Customer("lee", 1212);
		cm1.bonusPoint=2222;
		int priceL=cm1.calcPrice(10000);
		System.out.println(cm1.showInfo()+priceL);
		Customer cm2=new Vip("Shin", 11111);
		int s=cm2.calcPrice(10000);
		System.out.println(cm2.showInfo()+s);
		//자식것에서 override하면 부모 메서드에 영향줌
		//다형성
	}
}
