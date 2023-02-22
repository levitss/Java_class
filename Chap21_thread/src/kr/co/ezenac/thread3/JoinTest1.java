package kr.co.ezenac.thread3;
class Mt extends Thread{
	int start,end;
	int sum=0;
	public Mt(int s, int e) {
		this.end=e;
		this.start=s;
	}
	
	
	
	
	@Override
	public void run() {
		
		for(int i=start;i<=end;i++){
			sum+=i;
		}
		
		
	}
}

public class JoinTest1 {
	public static void main(String[] args) throws InterruptedException {
		Mt th1=new Mt(1, 50);
		Mt th2=new Mt(51,100);
		th1.start();//main 스레드는 not running 상태로
		th2.start();
		
		th1.join();
		System.out.println(th1.sum);//이게  th1이 끝나기전에 실행되면 0이 반환됨
	}
}
