package kr.co.ezenac.decision02;

import java.util.Scanner;

/*
 *  사용자부터 나이를 입력받아서
 *  	8보다 작으면 : 미취학 아동입니다. 입장료는 1000원 입니다.
 *  	14보다 작으면 : 초등학생 학생입니다. 입장료는 2000원 입니다.
 *  	20보다 작으면 : 중,고등학생 학생입니다. 입장료는 2500원 입니다.
 *  	그외 : 일반인입니다. 입장료는 3000원 입니다.
 */
public class IfElseIfTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요: ");
		int age = scan.nextInt();
		int charge;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}
		else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생 학생입니다.");			
		}
		else if (age < 20) {
			charge = 2500;
			System.out.println("중,고등학생 학생입니다.");			
		}
		else {
			charge = 3000;
			System.out.println("일반인입니다.");	
		}
		
		System.out.println("입장료는 " +charge+ "원 입니다.");
		
		scan.close();		
		
	}
}














