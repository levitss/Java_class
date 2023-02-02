package kr.co.ezenac.collaboration02;

public class MainTest {
	public static void main(String[] args) {
		Person ps=new Person("jin", 20000);
		Taxi taxi3=new Taxi("이젠 운수");
		ps.takeTaxi(taxi3);
		ps.showInfo();
		taxi3.showInfo();
		
		
	}
	
}
