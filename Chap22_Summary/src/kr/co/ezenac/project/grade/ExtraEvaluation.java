package kr.co.ezenac.project.grade;

public class ExtraEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		String result;
		if(score>=70&&score<=100)
			result="P";
		else if (score>=0&&score<70)
			result="F";
		else 
			result="잘못된 값 입력";
		
		return result;
	}

}
