package kr.co.ezenac.thread2;

import java.util.ArrayList;

class PriorityThread extends Thread{
	@Override
	public void run() {
		int sum=0;
		Thread thread=Thread.currentThread();
		System.out.println(thread+" Start ");
		
		for (int i=0;i<1000000;i++) 
			sum+=i;
		System.out.println(thread.getPriority()+"end");
	
	}
}

public class PriorityTest {
	public static void main(String[] args) {
		int num=10;
		ArrayList<PriorityThread> arr=new ArrayList<>(num);
		
		for(int i=0;i<num;i++) {
			arr.add(new PriorityThread());
		}
		
		int k;
		for (k=Thread.MIN_PRIORITY; k<=Thread.MAX_PRIORITY;k++) {
			arr.get(k-1).setPriority(k);
		}
		
		
		
		for(int i=0;i<num;i++) {
			arr.get(i).start();
		}
		
		
		
		
	}
}
