package evaluation_project.grade;

public class Basic implements Evaluation {

	@Override
	public String grading(int score) {
		String grade;
		if(score>=90&&score<=100)
			grade="A";
		else if(score>=80&&score<90)
			grade="B";
		else if(score>=70&&score<80)
			grade="C";
		else if(score>=55&&score<70)
			grade="D";
		else if(score>=0&&score<55)
			grade="Fail";
		else
			grade="잘못된 값 입력";
		
		return grade;
	}
	

}
