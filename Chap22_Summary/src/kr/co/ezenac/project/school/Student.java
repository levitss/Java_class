package kr.co.ezenac.project.school;

import java.util.ArrayList;
//dto 역할
public class Student {
	private String studentName;
	private int studentId;
	private Subject majorSub;
	private ArrayList<Score> score=new ArrayList<>(); 
	
	public Student(String name,int id,Subject major) {
		this.majorSub=major;
		this.studentId=id;
		this.studentName=name;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Subject getMajorSub() {
		return majorSub;
	}

	public void setMajorSub(Subject majorSub) {
		this.majorSub = majorSub;
	}

	public void addSubScore(Score score){
		this.score.add(score);
	}

}
