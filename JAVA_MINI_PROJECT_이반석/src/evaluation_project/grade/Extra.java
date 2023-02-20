package evaluation_project.grade;

public class Extra implements Evaluation {
	@Override
	public String grading(int score) {
		String grade;
		if(score>=70&&score<=100)
			grade="Pass";
		else if(score>=0&&score<70)
			grade="Fail";
		else
			grade="잘못된 값 입력";
		return grade;
	}
	

}
