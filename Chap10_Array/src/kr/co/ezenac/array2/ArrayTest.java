package kr.co.ezenac.array2;

import java.util.Arrays;

public class ArrayTest {
//	int[]score=null;	//new 해서 객체가 생성이 되어야 값이 들어감. stack에 주소값이 할당되어야 heap에 접근 가능
//	score= {1,2}	
	public static void main(String[] args) {
		int [] score=null;
		score=new int[6];
		double []scored=new double [6];
		
		System.out.println("score 주소값"+score); //stack에 있는 score 배열의 주소값
		for (int i=0; i<score.length;i++) {
			score[i]=(int)(Math.random()*45+1);
//			scored[i]=Math.floor(Math.random()*10);
			//System.out.printf("score[%d]=%d\n",i,score[i]);
			if(i!=score.length-1) {
				System.out.print(score[i]+"\t");
			}
			else System.out.print(score[i]+"\t");
//			System.out.printf("scored[%d]=%f\n",i,scored[i]);
			System.out.println(Arrays.toString(score));
		}
	}
	
	
}
