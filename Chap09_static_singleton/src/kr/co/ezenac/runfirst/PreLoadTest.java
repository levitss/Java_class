package kr.co.ezenac.runfirst;

import java.util.Random;

public class PreLoadTest {
	static int num; //static member variable
	
	//static init block
	static {
		Random rand =new Random();
		num =rand.nextInt(100);
	}
	public static void main(String[] args) {//static이 우선 실행된다는 이야기
		System.out.println(num);
	}
	
}
