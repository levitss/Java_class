package kr.co.ezenac.string;

public class StringTest5 {
	
	public static void main(String[] args) {
		String java= new String("java");
		String android=new String ("android");
		StringBuilder builder=new StringBuilder(java);
		
		System.out.println(builder);
		builder.append(android);
		System.out.println(builder);
	}
	
}
