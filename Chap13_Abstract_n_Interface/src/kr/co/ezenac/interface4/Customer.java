package kr.co.ezenac.interface4;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("customer buy");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("customer order");
	}
	
	public void sayWeAreTheWorld() {
		System.out.println("We Are The World");
	}
	
}
