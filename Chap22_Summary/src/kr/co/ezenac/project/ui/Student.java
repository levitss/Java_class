package kr.co.ezenac.project.ui;

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
		if(major.required ().equals("KoreanLanguage"))
			mathGrade=grading(mscore);
		else 
			mathGrade=essenGrading(mscore);
	}
	public void inputLangScore(int lscore) {
		this.langScore=lscore;
		if(major.required ().equals("ComputerEngineering"))
			langGrade=grading(lscore);
		else
			langGrade=essenGrading(lscore);
	}
	
	
	public String showlang() {
		return name+"	"+studentId+"		"+major.required ()+"	"+langScore+"	"+langGrade;	
	}
	public String showmath() {
		return name+"	"+studentId+"		"+major.required ()+"	"+mathScore+"	"+mathGrade;	
	}
	
	
	public void langresult() {
		System.out.println("ResultOfKoreanLanguageTest>>>");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Name	StudentId	RequiredCourse	Score	Grade");		
	}
	public void mathresult() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();
		System.out.println("ResultOfMathemathicsTest>>>");
		System.out.println("Name	StudentId	RequiredCourse	Score	Grade");
	}
	public String getName() {
		return name;
	}
	public int getStudentId() {
		return studentId;
	}

	
}
