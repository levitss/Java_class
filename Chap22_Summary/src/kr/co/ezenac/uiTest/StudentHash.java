package kr.co.ezenac.uiTest;

import java.util.HashMap;

public class StudentHash {
	
	
	
	HashMap<Integer, String> hash;
	public StudentHash() {
		hash=new HashMap<>();
	}
	public void addStudent(Student st) {
		hash.put(st.getStudentId(), st.getName());
	}
//	@Override
//	public String toString() {
//		return name+"	"+studentId+"		"+major.required ()+"	"+mathScore+"	"+mathGrade;	
//	}
}
