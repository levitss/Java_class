package kr.co.ezenac.collaboration;

public class Bus {
	int busNum;
	int passengerCount;
	int money;
//	Student st=new Student();
	public Bus (int busNum) {
//		super();
		this.busNum=busNum;
	}
	public void ride(int money) {
		this.passengerCount++;
		this.money+=money;//버스 입장에선 돈 버는거니 +
		
	}
	public void showInfo() {
		System.out.println(busNum+"버스의 승객은 "+passengerCount+"명이고 "+"수입은"+money+"원");
	}
//	
//	public int pay() {
//		int result=this.money-st.money;
//		return result;
//	}
}
