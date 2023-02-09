package kr.co.ezenac.interface3;

public class MyClass implements MyInterface{
////////////////강제
	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
	///////////선택
	@Override
	public void dmethod() {
		// TODO Auto-generated method stub
		System.out.println("myclass에서 재정의한 디폴트");
	}
}
