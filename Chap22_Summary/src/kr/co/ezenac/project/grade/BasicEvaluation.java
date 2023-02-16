package kr.co.ezenac.project.grade;

public class BasicEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		String result;
		if(score>=90&&score<=100)
			result="A";
		else if(score>=80)
			result="B";
		else if(score>=70)
			result="C";
		else if(score>=55)
			result="D";
		else if(score>=0&&score<=54)
			result="Fail";
		else 
			result="잘못된 값 입력";
		
		return result;
	}

}
