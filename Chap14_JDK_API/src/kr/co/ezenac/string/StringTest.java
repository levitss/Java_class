package kr.co.ezenac.string;

public class StringTest {
	public static void main(String[] args) {
		String str1=new String("q");
		String str2=new String("q");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		String str11="q";
		String str22="q";
		System.out.println(str11==str22);
		System.out.println(str11.equals(str22));
		System.out.println(str11==str1);
		System.out.println(str11.equals(str1));
//		literal로 생성한 객체는 동일한 메모리 주소	heap에 Stringpool을 만들어 재사용시 다시 호출
		//new는 개별적인 객체
		
		//intern() 스트링풀에 스트링 추가.
		
	}
	
}
