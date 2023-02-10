package ezenac;

public class StringbufferTest {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("LifeIsTooShort");
		str.append(false);
		System.out.println(str);
		System.out.println(str.substring(0,4));
		System.out.println(str.insert(3, 5.5));
		System.out.println(str);
		
	}
}
