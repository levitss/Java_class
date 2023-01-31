package kr.co.ezenac.reference;

public class Student {
	int stId;
	String stName;
	Subject kor;//subject 타입의 참조변수
	Subject math;
	//멤버변수
	public Student(int id,String name) {
		stName=name;
		stId=id;
		kor=new Subject();
		math=new Subject();
		
	}
	
}
