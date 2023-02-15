package kr.co.ezenac.project.ui;

import kr.co.ezenac.project.school.School;

/*요구사항(문제 정의)
 * 
 * Ezen 학교가 있음
 * 5명의 학생들이 수업을 듣고 있음
 * 과목은 국수.각 학생은 두 과목을 모두 수강함
 * 전공은 국어교육과, 컴퓨터공학 두가지가 있음
 * 국어교육과는 국어가 필수고 컴퓨터 공학은 수학이 필수과목임
 * 이번 학기 성적은 다음과 같다
 * 
 * 이름		학번			전공		필수과목	국어점수	수학점수
 * 스티브		20101010	국어교육	국어		  95	  56
 * 
 * 
 * 
 * 학점 부여하는 방법은 여러가지 
 * A~F or S~F
 * 일반과목은 A~F
 * 필수과목은 S~F
 * 필수
 * s		a		b		c		d		f
 * 95-100	90-94	80-89	70-79	60-69	~59
 * 
 * 일반
 * a		b		c		d		f
 * 90-100	80-89	70-79	55-69	~54
 * 
 *학점 결과를 아래와 같이 나올 수 있도록 구현하시오
 *
 *국어과목 학점 결과>>>
 *-----------------------------------------------------
 *이름		학번		필수		점수		학점
 *스티브		2020202	국어		95		s	
 *
 *수학과목 학점 결과>>>
 *-------------------------------------------------------
 *이름		학번		필수		점수		학점
 *스티브		2020202	국어		56		d
 *
 *학점 정책이 추가되는 경우 고려해서 객체 설계하고
 *인터페이스를 선언해서 각 정책이 해당 인터페이스를 구현하도록 하자
 *
 *2. uml 클래스 정의, 관계
 *3.구현
 *4.테스트
 *5.업글
 *
 *
 *
 *학과목 학점
 *
 *
 *
 *
 *
 *gof 디자인 패턴 중 builder pattern
 *	-method의 조합으로 결과물을 생성
 *	클라이언트 코드는 builder가 제공하는 메서드를 기반으로 원하는 결과물을 얻음
 * 	단계별 생성에 중점을 두는 패턴
 * 생성에 대한 과정과 각 결과물을 표현하는 방법을 분리하여 결과물이 나올 수 있도록 함
 *
 * 
 */


public class UiMain {
	
	//school 을 singtone으로 정의
	School ezenschool = School.getInctance();
	
	
	public static void main(String[] args) {
		UiMain uimain=new UiMain();
		uimain.createSubject();//시험과목 생성
		uimain.createStudent();
		
	}

	public void createStudent() {
		
	}

	public void createSubject() {
		
	}
}
