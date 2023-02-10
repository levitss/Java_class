package kr.co.ezenac.string;

public class StringTest3 {
	public static void main(String[] args) {
		String str="Apple";
		for(int i=0; i< str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='l')
				break;
			System.out.println(ch);	
		}
		int rr=2;
		String a="";
		System.out.println(a.valueOf(rr));
	}
}
