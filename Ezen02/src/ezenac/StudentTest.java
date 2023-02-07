package ezenac;
/*
 * 이젠 it 학원에 학생이 3명 있습니다
 * 각 학생마다 읽은 책을 기록하고 있음
 * 학생마다 읽은 책을 Student class 내에 array list를 생성하여 관리하도록 함
 * 아래처럼 출력
 * 
 * 이순신 학생이 읽은 책은 : 운영체제1, 운영체제2 입니다.
 * 신사임당 학생이 읽은 책은 : 딥러닝1, 딥러닝2, 딥러닝3 입니다.
 * 진도준 학생이 읽은 책은 : 머신러닝1,머신러닝2,머신러닝3,~6 입니다.
 */
public class StudentTest {
	public static void main(String[] args) {
		Student1 st=new Student1("lee");
		st.addBook("ssss");
		st.addBook("sssss");
		st.showInfo();
		
	}
}
