package kr.co.ezenac.encapsulation;

public class AddressTest {
	public static void main(String[] args) {
		DisplayAddress display=new DisplayAddress();
		String a=display.getAddress();
		System.out.println(a);
//		String b=display.getName();
//		System.out.println(b);
	}
}
