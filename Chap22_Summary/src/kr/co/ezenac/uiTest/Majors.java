package kr.co.ezenac.uiTest;

public class Majors {
	private String major;
	public Majors(String major) {
		this.major=major;
	}
	public String required() {
		if(this.major.equals("국어교육학과"))
			return "국어";
		if(this.major.equals("컴퓨터공학과"))
			return "수학";
		return major;
		
	}
	
}
