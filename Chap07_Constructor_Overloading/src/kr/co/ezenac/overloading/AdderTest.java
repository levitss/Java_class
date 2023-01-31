package kr.co.ezenac.overloading;

public class AdderTest {
	public static void main(String[] args) {
		Adder add=new Adder();
		int iResult=add.add(22, 0);
		System.out.println("iResult="+iResult);
		long lResult=add.add(100, 7500L);
		System.out.println("lResult="+lResult);
		double dResult=add.add(50.5, 555.55);
		System.out.println("dResult="+dResult);
		
	}
}
