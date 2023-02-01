package kr.co.ezenac.collaboration02;

public class Person {
	int money;
	String perName;

	
	public Person(String name,int money) {
		this.money=money;
		perName=name;
	}
	public void takeTaxi(Taxi taxi) {
		taxi.ride(10000);
		this.money-=10000;
		
		
	}
	public void showInfo() {
		System.out.println(perName+"의 남은 돈은"+this.money+"원 입니다.");
	}


}
