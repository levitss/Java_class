package kr.co.ezenac.interface3;

public interface MyInterface {
	int MAX_NUM=100;
	void method();
	
	default void dmethod() {
		System.out.println("디폴트 메서드 호출");
	}
	static void sMethod() {
		System.out.println("정적 메서드");
		
	}
	private void pMethod() {
		System.out.println("private method test");
	}
}
