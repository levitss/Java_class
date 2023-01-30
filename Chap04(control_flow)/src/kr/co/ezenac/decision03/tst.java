package kr.co.ezenac.decision03;

import java.util.Scanner;

public class tst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		int days=switch(month) {
		case 1,3->{
			System.out.println("");
			yield 22;
		}
		case 2->{
			System.out.println("28");
			yield 28;
		}
		default->{
			System.out.println("");
			yield 0;
		}
		};
		
		sc.close();
	}

}
