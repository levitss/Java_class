package kr.co.ezenac.lambda6;

public class TestPrintString {
	public static void main(String[] args) {
		//람다식을 변수에 대입
		PrintString lambdaStr=s->System.out.println(s);
		lambdaStr.showString("Hello");

		//매개변수로 전달하는 람다식
		showMyString(lambdaStr);
		
		//반환값으로 쓰이는 람다식
		PrintString reStr=returnString();
		reStr.showString("je");	
		
		String t="test";
		Printing<String, String> sgs=str->str+"s";
		System.out.println(sgs.print(t));
	
	
	
	}
	private static PrintString returnString() {
		return s->System.out.println(s);
	}
	private static void showMyString(PrintString p) {
		p.showString("llp");
	}
	
	
}
