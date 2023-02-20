package evaluation_project.grade;

public class Major implements Evaluation {
	@Override
	public String grading(int score) {
		String grade;
		if(score>=95&&score<=100)
			grade="S";
		else if(score>=90&&score<95)
			grade="A";
		else if(score>=80&&score<90)
			grade="B";
		else if(score>=70&&score<80)
			grade="C";
		else if(score>=60&&score<70)
			grade="D";
		else if(score>=0&&score<60)
			grade="Fail";
		else
			grade="잘못된 값 입력";
		
		return grade;
	}
	

}
