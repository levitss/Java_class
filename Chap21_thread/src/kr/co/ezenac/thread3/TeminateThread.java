package kr.co.ezenac.thread3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeminateThread extends Thread {
	private boolean flag=false;
	public void setFlag(boolean a) {
		this.flag=a;
	}
	public TeminateThread(String name) {
		super(name);//public Thread(String name) {
	}
	@Override
	public void run() {
		while(!flag) {//flag==false
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName()+" end ");
	}
	
	public static void main(String[] args) throws IOException {
//runnable과 thread의 차이
//상속을 받아 사용해야 하기 때문에 다른 클래스를 상속받아 사용할 수 없다는 단점이 있다.
//따라서 일반적으로는 Runnable 인터페이스를 구현해서 스레드를 사용한다.
		TeminateThread ta= new TeminateThread("ta");
		TeminateThread tb= new TeminateThread("tb");
		TeminateThread tc= new TeminateThread("tc");
		ta.start();
		tb.start();
		tc.start();
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int in;
		long time;
		while(true) {
			in=System.in.read();
			if(in=='A')
				ta.setFlag(true);
			else if(in=='B')
				tb.setFlag(true);
			else if(in=='C')
				tc.setFlag(true);
			else if(in=='M') {
				ta.setFlag(true);
				tb.setFlag(true);
				tc.setFlag(true);
				break;
			}
		}
		System.out.println("main thread end");
		
		
		

		
		
	}
}
