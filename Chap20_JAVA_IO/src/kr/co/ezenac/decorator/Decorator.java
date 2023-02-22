package kr.co.ezenac.decorator;

public class Decorator extends Coffee{
	Coffee coffee;
	public Decorator(Coffee c) {
		this.coffee=c;
	}
	@Override
	public void brewing() {
		coffee.brewing();
	}
	
}
