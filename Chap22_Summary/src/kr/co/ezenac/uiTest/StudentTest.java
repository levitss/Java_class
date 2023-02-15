package kr.co.ezenac.uiTest;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentTest {
	public static void main(String[] args) {
		Majors korean =new Majors("국어교육학과");
		Majors computer=new Majors("컴퓨터공학과"); 
		ArrayList<Student>list=new ArrayList<>();
		StudentHash hash=new StudentHash();
		Student s1=new Student("Lee", 1, computer);
		Student s2=new Student("Shin", 1, korean);
		s1.inputLangScore(95);
		s1.inputMathScore(80);
		s2.inputLangScore(95);
		s2.inputMathScore(90);
		hash.addStudent(s1);
		hash.addStudent(s2);
		
		list.add(s2);
		list.add(s1);
		
//		System.out.println(hash.);
		
		
		s1.langresult();
		for(Student st:list) {
			System.out.println(st.showlang());
		}
		s1.mathresult();
		for(Student st:list) {
			System.out.println(st.showmath());
		}
	}
}
