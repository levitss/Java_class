package kr.co.ezenac.overloading02;

public class StudentTest {
	public static void main(String[] args) {
		Student st=new Student();
		Student st1=new Student("s");
		Student st2=new Student(22);
		Student st3=new Student(14,"lee");
		System.out.println(st.toString());
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(st3.toString());
		System.out.println(st3);
	}
}
