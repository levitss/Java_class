package kr.co.ezenac.thread1;

public class ThreadTest2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread()+"Start");
		MyThread2 run1=new MyThread2();
		Thread t=new Thread(run1);
		//스레드는 자체적으로 start();가 있지만
		//runnable은 따로 스레드 객체 만들어서 매개변수로 실행해야 함 
		t.run();
		Thread t2=new Thread(run1);
		t2.run();
		Thread t3=new Thread(new MyThread2());
		t3.run();
		System.out.println(Thread.currentThread()+"End");
		
	}
}
class MyThread2 implements Runnable{

	@Override
	public void run() {
		int i;
		System.out.print("\n"+Thread.currentThread()+"Strart ");
		for(i=0;i<200;i++) {
			
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.print(Thread.currentThread()+"End");

	}
	
}
