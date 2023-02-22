package kr.co.ezenac.thread1;
class Mythread extends Thread {
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

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Mythread th=new Mythread();
		Mythread th2=new Mythread();
		th.start();
		th.start();
		for(int i=0;i<200;i++) {
			
			System.out.print(i+" ");
			
		}

		
	}
}
