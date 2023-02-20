package evaluation_project.school;

import java.util.ArrayList;
//세가지 DTO 통합
public class School {
	//singleton
	private School() {}
	private static School instance=new School();
	public static School getInstance() {
		if(instance==null)
			instance=new School();
		return instance;
	}
	
	
	private ArrayList<Student> students=new ArrayList<>();
	private ArrayList<Subject> subjects=new ArrayList<>();
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(Student student) {
		this.students.add(student);
	}
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(Subject subject) {
		this.subjects.add(subject);
	}
	
	
}
