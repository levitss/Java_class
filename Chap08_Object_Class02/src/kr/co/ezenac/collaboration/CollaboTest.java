package kr.co.ezenac.collaboration;

public class CollaboTest {

	public static void main(String[] args) {
		Student st1=new Student("Lee",10000);
//		st1.money=10000;
//		st1.name="Lee";
		Student st2=new Student("Shin",50000);
		Bus bus333=new Bus(333);
		Bus bus200=new Bus(200);
		Subway sub9=new Subway(9);
		st1.takeBus(bus333);//객체 bus가 대상
		//st1.takeSub(sub9);
		st1.showInfo();
		st2.takeSub(sub9);
		st2.showInfo();
		
		bus333.showInfo();
		//bus200.showInfo();
		sub9.showInfo();
		
		
		
		
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              

}
