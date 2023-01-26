package kr.co.ezenac.consoleinputoutput;

import java.util.Scanner;

/*
 *   입력 받은 두 수중에 큰 수를 출력하세요.
 *   입력1: 100
 *   입력2:  50
 *   100
 *   
 */

public class ScannerTest02 {

	public static void main(String[] args) {
		
		int max;
		System.out.println("입력 받은 두 수중에 큰 수를 출력하세요.\n");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력1: ");
		int x = scan.nextInt();
		
		System.out.print("입력2: ");
		int y = scan.nextInt();
		
		max = (x > y) ? x : y;
		System.out.println(max);
		
		scan.close();

	}

}







