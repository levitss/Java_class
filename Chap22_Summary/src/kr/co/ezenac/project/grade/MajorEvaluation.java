package kr.co.ezenac.project.grade;

public class MajorEvaluation implements GradeEvaluation{

	@Override
	public String getGrade(int score) {
		String result;
		if(score>=95&&score<=100)
			result="S";
		else if(score>=90)
			result="A";
		else if(score>=80)
			result="B";
		else if(score>=70)
			result="C";
		else if(score>=60)
			result="D";
		else if(score>=0&&score<60)
			result="Fail";
		else 
			result="잘못된 값 입력";
		
		return result;
	}
	
}
