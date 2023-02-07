package kr.co.ezenac.membership02;

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
		
		//자식 부모 형변환+
		
		Customer cs1=new Vip("test", 2222);
//		Vip vip1=new Customer("sss", 2);	
		System.out.println(cs1.getCustomerGrade());
		System.out.println(cs1.bonusRatio);
		System.out.println(c1 instanceof Vip );
		//결국 타입은 부모것이라 자식것들은 안보임.
		
		
	}
}
