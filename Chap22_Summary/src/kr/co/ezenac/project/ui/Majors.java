package kr.co.ezenac.project.ui;

public class Majors {
	private String major;
	public Majors(String major) {
		this.major=major;
	}
	public String required() {
		if(this.major.equals("KoreanLanguageEducation"))
			return "KoreanLanguage";
		if(this.major.equals("ComputerEngineering"))
			return "Math          ";
		return major;
		
	}
	
}
