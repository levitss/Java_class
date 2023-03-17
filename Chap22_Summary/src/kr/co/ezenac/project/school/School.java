package kr.co.ezenac.project.school;

import java.util.ArrayList;

public class School {
	private School() {}
	private static School instance=new School();
	public static School getInstance() {
		if(instance==null)
		instance=new School();
		return instance;
	}
	//
	private ArrayList<Student> students=new ArrayList<>();
	private ArrayList<Subject> subjects=new ArrayList<>();
	public ArrayList<Student> getStudents() {
		return students;
	}
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	public void addStudent(Student st) {
		students.add(st);
	}
	public void addSubject(Subject sb) {
		subjects.add(sb);
	}
	
	
	
	
}
//3가지 dto를 아우르는 클래스