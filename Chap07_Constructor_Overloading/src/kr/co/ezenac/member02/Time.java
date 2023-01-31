package kr.co.ezenac.member02;

public class Time {
	private int hour;
	private int minute;
	private int second;
	boolean minuteCheck;
	boolean secondCheck;	
	boolean hourCheck;

	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}

	
	
	
//	for (boolean hourCheck)
	public void setHour(int hour) {
		if (hour>23||hour<0) {
			System.out.println("잘못 입력하셨습니다");
			hourCheck=false;
			return;
		}
		this.hour = hour;
		hourCheck=true;
		}
		public void setMinute(int minute) {
		if (minute>60||minute<0) {
			System.out.println("잘못 입력하셨습니다");
			minuteCheck=false;
		}
		else {
			this.minute = minute;
			minuteCheck=true;
		}
	}
	public void setSecond(int second) {
		if (second>60||second<0) {
			System.out.println("잘못 입력하셨습니다");
			secondCheck=false;
		}
		else {
			this.second = second;
			secondCheck=true;
		}
	}
	@Override
	public String toString() {
		
		return this.getHour()+"시"+this.getMinute()+"분"+this.getSecond()+"초";
	}
	
	
	
	
}
