package kr.co.ezenac.reference;

public class Student {
	int stId;
	String stName;
	Subject kor;//subject 타입의 참조변수 선언. 객체는 아님
	Subject math;
	//멤버변수
	 
	public Student(int id,String name) {//constructor
		stName=name;
		stId=id;
		kor=new Subject();//인스턴스.
		math=new Subject();
	}
	

	public void setKorSubject(String name,int score) {//method
		kor.score=score;
		kor.subName=name;
	}
	public void setMathSub(String name,int score) {
		math.score=score;
		math.subName=name;
	}
	public void showStudentScore() {
		System.out.println(stName+"학생의 점수");
		System.out.println("총 점수는 "+(kor.score+math.score));
		System.out.println("평균 점수는 "+(kor.score+math.score)/2);//arr.lenght
		
	}
	
}
