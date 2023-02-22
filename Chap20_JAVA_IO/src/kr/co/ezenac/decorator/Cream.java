package kr.co.ezenac.decorator;

public class Cream extends Decorator{
	public Cream(Coffee c) {
		super(c);
		
	}
	@Override
	public void brewing() {
		System.out.print("and Cream");
	}

}
