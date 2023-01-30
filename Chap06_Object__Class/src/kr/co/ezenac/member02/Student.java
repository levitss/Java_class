package kr.co.ezenac.member02;

public class Student {
	private int studentId;//class내 한정인데 왜 studenttest 에서도 적용되는가
	String studentName;
	int grade;
	
	public Student(int studentId, String studentName, int grade) {//반환 타입이 없으나 메서드의 일종인 생성자 Stringtype outline 확인
		
		
		this.studentId=studentId;//this.studentId=멤버변수  
		this.grade=grade;
		this.studentName=studentName;
		
	}
	public String showStudentInfo() {
		return studentName+"학생의 학번은 "+studentId+"이고, "+grade+"학년이다";
			
	}
	
}
