package kr.co.ezenac.membership;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1=new Customer("lee",232323);
		c1.bonusPoint=200000;
		System.out.println(c1.showInfo());
		
		
		
		//vip 객체 생성 후 이전 데이터 복붙??
		Vip vip1=new Vip("lee",232323);
		vip1.calcPrice(5000);
		System.out.println(vip1.showInfo());
		vip1.calcPrice(5000);
		System.out.println(vip1.showInfo());
		vip1.calcPrice(5000);
		System.out.println(vip1.showInfo());
		vip1.calcPrice(5000);
		System.out.println(vip1.showInfo());
		
		
		//자식 부모 형변환
		
	}
}
