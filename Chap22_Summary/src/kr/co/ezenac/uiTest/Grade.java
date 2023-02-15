package kr.co.ezenac.uiTest;

public interface Grade {
	
	
	public default String essenGrading(int score) {
		if(score>=95)
			return "s";
		if(score>=90)
			return "a";
		if(score>=80)
			return "b";
		if(score>=70)
			return "c";
		if(score>=60)
			return "d";
		return "f";

	};
	public default String grading(int score){
		if(score>=90)
			return "a";
		if(score>=80)
			return "b";
		if(score>=70)
			return "c";
		if(score>=55)
			return "d";
		return "f";

	}
}
