package kr.co.ezenac.exception;

public class AutoCloseableTest {
	public static void main(String[] args) {
		AutoCloseTest obj=new AutoCloseTest();
		try(obj){
			System.out.println("실행");
		}catch (Exception e) {
			System.out.println("예외처리");
		}
	}
}
