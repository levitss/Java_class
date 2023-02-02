package kr.co.ezenac.array;

public class CharArrTest {
	public static void main(String[] args) {
		char[] charArr=new char[26];
		char ch='A';
		for (int i=0;i<charArr.length;i++) {
			charArr[i]=ch;
			System.out.print(charArr[i]+", "+(int) ch+"\n");
			ch++;
		}
		//향상된 for 
		for(char alpha : charArr) {
			System.out.println(alpha+" "+(int)alpha);
			
		}
	}
}
