package kr.co.ezenac.member;
/*
 * 클래스 선언
 * [가시성 지시자] class name{
 * 		//필드들
 * 		[가시성 지시자] 자료형 필드명;
 * 		//메소드들
 * 			[가시성지시자][반환자료형 or void] 메서드명 (매개변수){
 		* 	//메소드 블록에 동작에 관한 내용 작성
 *	 	}
 * };
 * 
 * 2. 클래스 사용방법
 * 클래스명 객체명 = new 클래스명();
 * Student sd=new Student();
 * 
 * 3. java안에 클래스 여러개 있을 수 있지만 통상적으로는 하나.
 * 접근한정자 public class는 하나뿐임.
 * public 클래스와 .java 파일 이름은 동일해야 함.
 * 
 * 4. 클래스명은 대문자로 시작.//상수는 전부 대문자. 변수는 소문자로 시작
 * 	자바는 기본적으로 camel notation 
 * 
 * 
 * 
 * 가시성 지시자 public, private,protected
 * 
 * 
 * 
 */
public class Student {
	int studentID;
	String studentName;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName+","+address);
	}
}
