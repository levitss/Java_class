package kr.co.ezenac.member;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student();
		st1.showStudentInfo(); //멤버변수는 기본적인 값이 init되어있음
		Student st2=new Student();
		st2.address="sss";
		st2.studentID=222;
		st2.studentName="sw";
		st2.showStudentInfo();
		
		Student st3=new Student();
		st3.address="서초구";
		st3.studentName="shin";
		st3.showStudentInfo();
		
		System.out.println(st1);//참조주소값
		System.out.println(st2);
				
	}

}
