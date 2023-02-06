package kr.co.ezenac.arrayList;

import java.util.ArrayList;
/*
 * 학생 2명
 * 학생1은 2과목 수강
 * 학생2는 3과목 수강
 * arraylist 활용해서 두 학생의 과목 성적과 총점을 출력
 */
public class Student {
	private int studentId;
	private String studentName;
	ArrayList<Subject> subjectlist;//기본 10개 배열 생성됨
	public Student(int id, String name) {
		this.studentId=id;
		this.studentName=name;
		subjectlist=new ArrayList<>();
	}
	public void addSubject(String name,int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		this.subjectlist.add(subject);//name score가 add됨 
	}
	public void showInfo() {
		int total=0;
		for(Subject subject:subjectlist) {//list서 꺼내서 subject 타입의 변수 subject에 삽입
			total+=subject.getScore();
			System.out.println(this.studentName+" "+subject.getName()+" "+subject.getScore());
		}
		System.out.println(this.studentName+" total "+total);
		
		
	}
	
}
