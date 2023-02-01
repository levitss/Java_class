package kr.co.ezenac.collaboration02;

public class Taxi {
	int money;
	String name;
	public Taxi(String name) {
		this.name=name;
	}
	
	public void ride(int money) {
		this.money+=money;
	}
	
	public void showInfo() {
		System.out.println(name+"택시 수입은 "+money+"원 입니다.");
	}
}
