package kr.co.ezenac.collaboration;

public class Student {
	String name;
	int money;
	int grade;
	int countSub;
	int countBus;
	Bus bus= new Bus(333);
	Subway sub=new Subway(9);
			
	public Student(String name,int money) {
		this.name=name;
		this.money=money;
	}
	public void takeBus(Bus bus) {//객체가 매개변수로
		bus.ride(1250);
		this.money-=1250;
		countBus++;
	}
	public void takeSub(Subway sub) {
		sub.ride(1300);
		this.money-=1300;
		countSub++;
	}
	public void showInfo() {
		
		if (countSub==0)
		System.out.println(this.name+"는 "+bus.busNum+"번 버스를 탔고 "+this.name+"의 남은 돈은 "
		+money); else if(countSub==0)
		System.out.println(this.name+"는 "+sub.lineNum+"호선을 탔고 "+this.name+"의 남은 돈은 "
		+money);
		else if (countSub>=1&&countBus>=1) System.out.println(this.name+"는 "+sub.lineNum+"호선과 "+bus.busNum+"번을 탔고"+this.name+"의 남은 돈은 "
				+money);
		else System.out.println();
		
		/*
		 * for(int i=0;i<(this.countSub+this.countBus);i++) { for(int
		 * q=0;q<countSub;q++) { System.out.print(sub.lineNum+"호선, ");
		 * 
		 * } System.out.println(bus.busNum+"번 버스");
		 * 
		 * }
		 */
		
	}
	

}
