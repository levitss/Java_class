package kr.co.ezenac.array04;

public class MyArrTest {
	public static void main(String[] args) {
		MyArr myArr=new MyArr(6);
		myArr.printAll();
		myArr.addElement(50);
		myArr.addElement(60);
		myArr.addElement(70);
		myArr.printAll();
		myArr.getSize();
		
		System.out.println(myArr.getEelement(0));
		System.out.println("2번 배열의 인덱스에 있는 값은 "+myArr.getEelement(2));
		
		
		
		
		
		//주석 단축키 안될때는 소스 토글커맨드 ctrl+7
	}
}
