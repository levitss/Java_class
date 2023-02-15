package kr.co.ezenac.lambda4;

public class TestStringConcat {
	public static void main(String[] args) {
		//class 생성 후 메서드 호출
		String s1="스트링";
		String s2="test";
		StringConcatImpl sc=new StringConcatImpl();
		sc.makeString(s1, s2);
		StringConcat con=new StringConcatImpl();
		con.makeString(s1, s2);
		
		//람다식
		StringConcat concat2=(s,v)->System.out.println(s+v);//인터페이스 구현을 여기서
		concat2.makeString(s1, s2);
		
		/*
		 * 익명 객체를 생성하는 람다식
		 * 자바에서는 객체 없이 메서드 호출 될 수 없음
		 *람다식을 구현하면 익명내부클래스가 생성되고 이를 통해 익명객체가 생성됨
		 */ 
		StringConcat concat3=new StringConcat() {
			
			@Override
			public void makeString(String s, String v) {
				System.out.println(s+v);
			}
		};
		concat3.makeString(s1, s2);
		
		
	}
}
