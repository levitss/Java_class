package kr.co.ezenac.object;

public class EqualTest {
	
	public static void main(String[] args) {
		Student s1=new Student(123, "lee");
		Student s1_1=s1;
		Student s2=new Student(123, "lee");
		System.out.println(s1==s2);
		System.out.println(s1==s1_1);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s1_1));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		Integer i1=new Integer(1);
		Integer i2=new Integer(1);
		System.out.println(i1.equals(i2));//Integer 에서 오버라이딩된 equals
		String ss1=new String("s");
		String ss2=new String("s");
		System.out.println(ss1.equals(ss2));//String에서 오버라이딩됨.
		System.out.println(ss1.hashCode());
				
		System.out.println(s1.equals(s2));// 오버라이드해서 같다고하나 실제 해시코드값은 다름
		System.out.println(System.identityHashCode(s1_1));//물리적 해시코드
		System.out.println(System.identityHashCode(s1));
		
		
	
	
	}
	
}
