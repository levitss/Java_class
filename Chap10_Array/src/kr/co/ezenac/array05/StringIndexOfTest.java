package kr.co.ezenac.array05;
/*
 * public int indexOf(int ch): 문자열에서 문자 찾아 위치를 리턴해줌
 */
public class StringIndexOfTest {
	public static void main(String[] args) {
		String a="sssssdsssss";
		String str="AppleBannanaOrange";
		//System.out.println(a.indexOf("d"));//012345
		//System.out.println(str.indexOf("a"));//첫번째 값만 리턴해줌
		int num1=str.indexOf("a");
		int num2=str.indexOf("a",num1+1);//인덱스 값
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		String [] strArr=new String[5];
		strArr[1]="tesssssssst";
	}
}





