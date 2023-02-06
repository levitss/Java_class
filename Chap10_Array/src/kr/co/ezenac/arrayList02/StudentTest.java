package kr.co.ezenac.arrayList02;
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
		Student st=new Student("Lee");
		st.addBook("운영체제1");
		st.addBook("운영체제2");
		st.showInfo();
		Student st2=new Student("shin");
		for(int i=1; i<4;i++) {
			st2.addBook("딥러닝"+i);
		}
		st2.showInfo();
		Student st3=new Student("Jin");
		for(int i=0; i<6;i++) {
			st3.addBook("머신러닝"+(i+1));
		}
		st3.showInfo();
		
	}
}
