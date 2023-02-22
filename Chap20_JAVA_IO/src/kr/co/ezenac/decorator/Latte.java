package kr.co.ezenac.decorator;

public class Latte extends Decorator{
	public Latte(Coffee c) {
		super(c);
	}
	@Override
	public void brewing() {
		super.brewing();
		System.out.print("added Latte ");
	}

}
