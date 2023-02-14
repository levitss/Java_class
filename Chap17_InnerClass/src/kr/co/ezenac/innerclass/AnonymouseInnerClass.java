package kr.co.ezenac.innerclass;
class Outter{
	int outNum=100;
	static int sNum=200;
	Runnable getRunnarble(int i) {//리턴 타입이 클래스
		int num=10;
		
//		class MyRunnarble implements
		//리턴서 객체를 생성시킴
		//이전에 쓰던 arrayList.add(new Member); 
		return new Runnable(){//함수형 인터페이스. 람다로도 가능
			int localNum=100; //
			@Override
			public void run() {
				//i=10;   //매개변수 상수로 바뀌어서
				//num=2;	//지역변수도 상수로 바뀜
				System.out.println(i);
				System.out.println(num);
				System.out.println(localNum);
				System.out.println(outNum);
				System.out.println(Outter.sNum);


			}
		};
	}
	Runnable runner =new Runnable() {//runner는 객체 이름이 아니고 Runnable 타입 변수
		
		@Override
		public void run() {
			System.out.println("s");
		}
	};
}
public class AnonymouseInnerClass {



	public static void main(String[] args) {
		Outter out=new Outter();
		Runnable runnable=out.getRunnarble(10);
		runnable.run();
		out.runner.run();
		

	}
}

