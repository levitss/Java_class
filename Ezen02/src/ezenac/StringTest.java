package ezenac;

public class StringTest {
	public static void main(String[] args) {
		String a="Apple";
		String b="Samsung";
		String b_="Samsung";
		String c="Sony    ";
		System.out.println(c.trim());
		System.out.println(b.equals(b_));
		System.out.println(b==b_);
		System.out.println(a.concat(c));
		System.out.println(a.charAt(0));
		System.out.println(b.substring(2));
		System.out.println(a.indexOf("l"));
		int as=5;
		System.out.println(String.valueOf(as));
		System.out.println(a.contains("pp"));
		System.out.println(c.startsWith("S"));
		System.out.println(c.endsWith("s"));
		String tysd="";
		System.out.println(tysd.isEmpty());
		System.out.println(a.toUpperCase());
				
		
	}
}
