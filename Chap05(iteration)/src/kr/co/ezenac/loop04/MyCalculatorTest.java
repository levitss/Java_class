package kr.co.ezenac.loop04;

import java.util.Scanner;

/*
 *  메뉴를 선택하세요.
 *  1.더하기
 *  2.빼기
 *  3.곱하기
 *  4.나누기
 *  5.끝내기
 *  
 *  1
 *  첫번째 숫자: 1
 *  두번째 숫자: 2
 *  1 + 2 = 3
 *  메뉴를 선택하세요.
 *  1.더하기
 *  2.빼기
 *  3.곱하기
 *  4.나누기
 *  0.끝내기 
 */
public class MyCalculatorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			showMenu();
			char myChar = scanner.next().charAt(0);
			
			int num = myChar - '0';
			/*
			 * 	  문자 - 문자 
			 * 	  '1' - '0'
			 *     49 - 48
			 *     1	
			 */
			
			if (num == 0)
				break;
			else {
				if (num > 4) {
					System.out.println("메뉴를 잘못 선택했습니다.");
					continue;
				}
				
				//사칙연산 실행
				System.out.print("첫 번재 숫자 : ");
				int num1 = scanner.nextInt();
				
				System.out.print("두 번재 숫자 : ");
				int num2 = scanner.nextInt();		
				
				if(num == 1)
					addNum(num1, num2);
				else if (num == 2)
					minusNum(num1, num2);
				else if (num == 3)
					multiplyNum(num1, num2);
				else if (num == 4)
					divideNum(num1, num2);
			}
			
		}
		
		System.out.println("계산기를 종료합니다.");
		scanner.close();

	}

	public static void divideNum(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	public static void multiplyNum(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	public static void minusNum(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	public static void addNum(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	//메뉴출력
	public static void showMenu() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.곱하기");
		System.out.println("4.나누기");
		System.out.println("0.끝내기");
	}

}













