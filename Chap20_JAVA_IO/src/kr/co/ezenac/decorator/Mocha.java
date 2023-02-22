package kr.co.ezenac.decorator;

public class Mocha extends Decorator {
	public Mocha(Coffee c) {
		super(c);
	}
	@Override
	public void brewing() {
		System.out.print("add Mocha syrup ");
	}
	
}
