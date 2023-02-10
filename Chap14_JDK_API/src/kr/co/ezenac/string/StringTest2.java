package kr.co.ezenac.string;

public class StringTest2 {
	public static void main(String[] args) {
		String str="AppleBananaOrange";
		int num1=str.indexOf("Banana");
		int num2=str.indexOf("Orange");
		String java=new String("jav");
		String kotlin=new String("Kot");
		System.out.println(System.identityHashCode(java));
		java=java.concat(kotlin);
		System.out.println(System.identityHashCode(java));
		System.out.println(java.indexOf("va"));
		String str2=str.substring(num1,num2);
		System.out.println(str2);
		String str3=str.substring(num1);
		//slice
		System.out.println(str3);
		
	}
}
