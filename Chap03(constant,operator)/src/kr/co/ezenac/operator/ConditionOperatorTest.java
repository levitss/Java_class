package kr.co.ezenac.operator;

public class ConditionOperatorTest {

	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 50;
		
		int bigNum = (num1 > num2) ? num1 : num2;
		System.out.println("큰 수 : " + bigNum);
		
		int difference = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		System.out.println("두 수의 차 : " + difference);

	}

}
