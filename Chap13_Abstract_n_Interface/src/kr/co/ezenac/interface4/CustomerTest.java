package kr.co.ezenac.interface4;

public class CustomerTest {
	public static void main(String[] args) {
		Customer ct1=new Customer();
		ct1.buy();
		ct1.sayWeAreTheWorld();
		
		Buy buyer = ct1;//new Customer();와 같은 의미
		buyer.buy();
		Sell seller=ct1;
		seller.sell();
	}
}
