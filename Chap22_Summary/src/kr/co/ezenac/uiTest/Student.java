package kr.co.ezenac.uiTest;

public class Student implements Grade{
	private String name;
	private Majors major;
	private int studentId;
	private int mathScore;
	private int langScore;
	private String mathGrade;
	private String langGrade;
	public Student(String name, int id, Majors major) {
		this.name=name;
		studentId=id;
		this.major=major;
	}
	public void inputMathScore(int mscore) {
		this.mathScore=mscore;
		if(major.required ().equals("국어교육학과"))
			mathGrade=grading(mscore);
		else 
			mathGrade=essenGrading(mscore);
	}
	public void inputLangScore(int lscore) {
		this.langScore=lscore;
		if(major.required ().equals("컴퓨터공학과"))
			langGrade=grading(lscore);
		else
			langGrade=essenGrading(lscore);
	}
	
	
	public String showlang() {
		return name+"	"+studentId+"	"+major.required ()+"	"+langScore+"	"+langGrade;	
	}
	public String showmath() {
		return name+"	"+studentId+"	"+major.required ()+"	"+mathScore+"	"+mathGrade;	
	}
	
	
	public void langresult() {
		System.out.println("국어 시험결과>>>");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("이름	학번	필수 과목	점수	등급");		
	}
	public void mathresult() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		System.out.println("수학시험 결과>>>");
		System.out.println("이름	학번	필수 과목	점수	등급");
	}
	public String getName() {
		return name;
	}
	public int getStudentId() {
		return studentId;
	}

	
}
