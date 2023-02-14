package kr.co.ezenac.innerclass;

import kr.co.ezenac.innerclass.OutClass.InStaticClass;

class OutClass{
	private int num=10;
	private static int sNum=20;
	
	private InClass inClass;
	public OutClass() {
		inClass=new InClass();//인스턴스 내부 클래스
	}
	static class InStaticClass{//정적 클래스 =외부 클래스의 클래스 메소드에 사용될 목적
		static int sN=100;
		int i=2;
		void inTest() {
//			System.out.println(num);//아웃클래스 멤버변수 사용 불가 //static이 아니라
			System.out.println(sN);
			System.out.println(i);
			System.out.println(sNum);
		}
		static void intesst() {
			System.out.println(sN);
//			System.out.println(i);
			System.out.println(sNum);
		}
		
		
	}
	class InClass{//인스턴스 클래스=외부클래스의 인스턴스 변수나 인스턴스 메소드에 사용될 목적
		int inNum=100;
//		static int a =5;		static은 안되고
//		static final int a =5;    final은 됨
		void inTest() {
			System.out.println("아웃클래스 멤버변수 호출"+num);
			System.out.println(sNum);
		}
	}
	
		
	
	public void usingInClass() {
		inClass.inTest();
	}
	
}



public class InnerClassTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();//생성자에 세팅되어있는걸로 내부 클래스 생성함
		outClass.usingInClass();//내부 클래스 기능 호출
		InStaticClass.intesst();
		OutClass.InStaticClass.intesst();
		//외부 클래스를 이용하여 내부 클래스 생성
		OutClass.InClass inClass=outClass.new InClass();
		OutClass.InStaticClass sInClass=new OutClass.InStaticClass();
		sInClass.inTest();
		for (int a = 0; a < 10; a++) {

		}
		
		
		
		
	}
	
}
