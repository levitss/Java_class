package kr.co.ezenac.interface1;

public class CalcTest {
	public static void main(String[] args) {
		CalcClass cal=new CalcClass();
		System.out.println(cal.add(1, 0));
		Calc cal1=new CompleteCalc();
		System.out.println(cal1.divide(5, 2));
		System.out.println(cal1.substract(5, 52));
		System.out.println(cal1.add(5, 7));
		System.out.println(cal1.time(5, 88754533));
		
		
	}
}
