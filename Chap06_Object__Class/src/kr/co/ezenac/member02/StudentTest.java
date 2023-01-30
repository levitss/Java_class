package kr.co.ezenac.member02;

public class StudentTest {

	public static void main(String[] args) {
		Student st1=new Student(20230116, "진", 3);
		
		String result = st1.showStudentInfo();
		System.out.println(result);
		
		System.out.println(st1.showStudentInfo());
		
		Student st2=new Student(1999, "진양", 5);
		System.out.println(st2.showStudentInfo());
		
		

	}

}
