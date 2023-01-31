package kr.co.ezenac.member;

public class Monitor {
	//멤버변수
	String color;
	int channal=299;
	int Volume;
	boolean power;
	
	//멤버메서드
	//모니터 on/off
	public void power() {
		if(!power) {//default는 false
			System.out.println("모니터가 켜졌습니다.");
			this.power=!power;//true로
		}else {
			System.out.println("모니터가 꺼졌습니다.");
			this.power=!power;
		}
	}
	public void channalUp() {
		int maxChannal = 300;
		if(this.channal>maxChannal) {
			channal=1;
			System.out.println("현재 채널은 "+this.channal);
		}else {
			this.channal++;
			System.out.println("현재 채널은 "+this.channal);	
		}
		
	}
	public void channalDown() {
		if(this.channal<1) {
			channal=300;
			System.out.println("현재 채널은 300입니다");
		}else {
			this.channal--;
			System.out.println("현재 채널은 "+this.channal);	
		}
		
	}
}
