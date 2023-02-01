package kr.co.ezenac.collaboration;

public class Subway {
	int lineNum;
	int passenCount;
	int money;
	
	public Subway(int num) {
		lineNum=num;
	}
		
	public void ride(int money) {
		this.money+=money;
		passenCount++;
	}
	public void showInfo() {
		System.out.println(lineNum+"호선의 승객은 "+passenCount+"명이고 수입은 "+money+"원");
	}
	

}
