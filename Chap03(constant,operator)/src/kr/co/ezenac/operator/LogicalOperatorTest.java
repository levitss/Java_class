package kr.co.ezenac.operator;

public class LogicalOperatorTest {

	public static void main(String[] args) {
		
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		result = (num1 > 1) && (num1 < 10);
		System.out.println("1 초과 10 미만인가? : " + result);
		
		//num2, 논리합 
		result = ((num2 % 2) == 0) || ((num2 % 3) == 0); 
		System.out.println("2 또는 3의 배수인가? : " + result);		
		
	}
}
