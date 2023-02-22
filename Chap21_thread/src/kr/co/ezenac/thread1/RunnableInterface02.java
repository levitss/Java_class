package kr.co.ezenac.thread1;

/*
 * 여러 개의 스레드가 동시 실행
 * 하나는 20 미만의 짝수 출력
 * 10미만의 수 출력
 */
class Mt extends Thread{
	@Override
	public void run() {
		System.out.println("Mt Thread");
	
	}
}

public class RunnableInterface02 {
	public static void main(String[] args) throws InterruptedException {
		Runnable task=()->{
			System.out.print(Thread.currentThread().getName()+" start ");

//			try {
//				Thread.sleep(1000);
//				System.out.print(Thread.currentThread().getName()+"start");
//			} catch(InterruptedException e){e.printStackTrace();}
			
			
			for(int i=1;i<10;i++)
				System.out.print(i+" ");
			System.out.println(Thread.currentThread().getName()+" end");
			
		};
		Runnable even=()->{
			System.out.print(Thread.currentThread().getName()+" start ");
			int e=0;
			for(int i=1;i<20;i++) {
				if(i%2==0)
					System.out.print(i+" ");
			}
			System.out.println(Thread.currentThread().getName()+" end");
		};
		long id=Thread.currentThread().getId();
		String name=Thread.currentThread().getName();
		Thread.State state= Thread.currentThread().getState();
		Thread t1=new Thread(task);
		Thread t2=new Thread(even);
		Thread t3=new Thread(even);
		Mt t4= new Mt();
//		t3.setPriority(Thread.NORM_PRIORITY);
//		t1.setPriority(Thread.MAX_PRIORITY);
//		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		
		System.out.println(id+" "+name+" "+state);
		t1.join();
		t3.start();
		
		System.out.println(id+" "+name+" "+state);
		t3.join();
		t2.start();
		
		System.out.println(id+" "+name+" "+state);
		t2.join();
		t4.start();
		t4.join();
		System.out.println(id+" "+name+" "+state);
		
		
	}
}
