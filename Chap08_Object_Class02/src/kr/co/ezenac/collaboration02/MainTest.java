package kr.co.ezenac.collaboration02;

public class MainTest {
	public static void main(String[] args) {
		Person ps=new Person("jin", 20000);
		Taxi taxi=new Taxi("이젠 운수");
		ps.takeTaxi(taxi);
		ps.showInfo();
		taxi.showInfo();
		
		
	}
	
}
