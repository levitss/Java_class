package kr.co.ezenac.singleton;

public class CompanyTest {
	public static void main(String[] args) {
		Company com1=Company.getInstance();
		Company com2=Company.getInstance();
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com1.equals(com2));
		System.out.println(com1==com2);
	}
}
