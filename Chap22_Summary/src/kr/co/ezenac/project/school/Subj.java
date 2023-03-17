package kr.co.ezenac.project.school;

import java.util.ArrayList;

public class Subject {
	//	dto
	private int subjectId;//map으로 하면? //현재는 기본 틀
	private String subjectName;
	private int gradeType; //boolean으로 ? 기본은 a~f
	ArrayList<Student> students=new ArrayList<>();
	
	public Subject(int subId, String subName) {
		this.subjectId=subId;
		this.subjectName=subName;
	}//
//
	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void register(Student st) {
		this.students.add(st);
	}
	
	
}
