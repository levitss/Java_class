package evaluation_project.school;
//Subject DTO

import java.util.ArrayList;

public class Subject {
	private int subId;
	private String subName;
	private int type;//평가타입. 전공과목은 따로 표기하니 p/f 구분용도로 사용
	ArrayList<Student> students=new ArrayList<>();
	public Subject(int subId,String subName) {
		this.subName=subName;
		this.subId=subId;
	}
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(Student student) {
		this.students.add(student);
	}
}
