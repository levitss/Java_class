package kr.co.ezenac.loop02;

// 1부터 숫자를 더하여 100이 넘는 순간의 그 숫자와 합을 출력하세요
// 100이 넘는 순간의 합: 
// 100이 넘는 순간의 num : 

public class BreakTest {

	public static void main(String[] args) {
		int sum = 0;
		int num;
		for(num=1 ; ; num++) {
			sum += num;
			if(sum >= 100) break;
		}
		
		System.out.println("100이 넘는 순간의 합: " + sum);
		System.out.println("100이 넘는 순간의 num : " + num);
	}
}
