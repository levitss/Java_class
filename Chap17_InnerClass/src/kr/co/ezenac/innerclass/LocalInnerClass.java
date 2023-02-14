package kr.co.ezenac.innerclass;
class Outer{
	int outNum=100;
	static int sNum=200;
	Runnable getRunnarble(int i) {//리턴 타입이 클래스
		int num=10;
		class myRunnarble implements Runnable{//함수형 인터페이스. 람다로도 가능
			int localNum=100; //
			@Override
			public void run() {
				//i=10;   //매개변수 상수로 바뀌어서
				//num=2;	//지역변수도 상수로 바뀜
				System.out.println(i);
				System.out.println(num);
				System.out.println(localNum);
				System.out.println();
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
			
		}
		
		
		return new myRunnarble();//runnable 구현해서  
	}
}
public class LocalInnerClass {
	public static void main(String[] args) {
		Outer out=new Outer();
		Runnable runner= out.getRunnarble(10);
		Thread thread= new Thread(runner);
		thread.start();
		
		
		
		
	}
}
