package kr.co.ezenac.arrayList;

public class StudentTest {
	public static void main(String[] args) {
		Student st=new Student(2010000, "lee");
		st.addSubject("수학", 100);
		st.addSubject("국어", 95);
		st.showInfo();
		Student st2=new Student(202222,"Shin");
		st2.addSubject("수학", 60);
		st2.addSubject("국어", 100);
		st2.showInfo();
	}
}
