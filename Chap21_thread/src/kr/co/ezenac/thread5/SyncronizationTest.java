package kr.co.ezenac.thread5;

public class SyncronizationTest {
	/*예시
	 * 스레드 1은 입금
	 * 스레드 2는 출금
	 * 
	 */
	public static Bank myBank=new Bank();//shared resource
	public static void main(String[] args) throws InterruptedException {
		Lee threadLee=new Lee(1000);
		Shin threadShin=new Shin(5000);
		threadLee.start();
		threadShin.start();
//		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
class Lee extends Thread{
	int input;
	public Lee(int money) {
		this.input=money;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		
		System.out.println("입금");
		SyncronizationTest.myBank.deposit(input);
		System.out.println("입금 "+input+" : "+SyncronizationTest.myBank.getMoney());
	}
}
class Shin extends Thread{
	int output;
	public Shin(int withdraw) {
		this.output=withdraw;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		System.out.println("출금");
		SyncronizationTest.myBank.withdraw(1000);
		System.out.println("입금 "+output+" : "+ SyncronizationTest.myBank.getMoney());
	}
}


class Bank  {
	private int money=10000;
	public void withdraw(int a) {
		this.money-=a;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deposit(int a) {
		this.money+=a;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
