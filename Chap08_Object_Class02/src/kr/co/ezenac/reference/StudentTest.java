package kr.co.ezenac.reference;

public class StudentTest {
	public static void main(String[] args) {
		Student st= new Student(20230201,"Lee");
		st.setKorSubject("국어", 95);
		st.setMathSub("수학", 88);
		st.showStudentScore();
		Student st2=new Student(20220303, "shin");
		st2.setKorSubject("kor",10);
		st2.setMathSub("math", 20);
		st2.showStudentScore();
		
	}
}
