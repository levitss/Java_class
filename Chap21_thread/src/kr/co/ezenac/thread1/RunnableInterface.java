package kr.co.ezenac.thread1;

public class RunnableInterface {
	public static void main(String[] args) {
		//runnable 에 람다식
		Runnable task=()->{
			try {
				Thread.sleep(3000);
			}catch (InterruptedException e) {e.printStackTrace();}
			int sum=0;
			for(int i=1;i<=10;i++)
				sum+=i;
			String name=Thread.currentThread().getName();
			System.out.println(name+":"+sum);
		};
		Thread th= new Thread(task);
		th.start();
	}
}
