package kr.co.ezenac.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//정수 배열에 스트림 생성하여 연산 수행
public class IntArrayTest {
	public static void main(String[] args) {
		int [] arr= {8,1,2,3,4,5};
//		for (int a:arr)
//			System.out.println(a);
	//	Arrays.stream(arr)//스트림 객체가 만들어짐
		int sum=Arrays.stream(arr).sum();
		
		long count=Arrays.stream(arr).count();
		
		Arrays.stream(arr).forEach((a)->System.out.print(a+"\t"));
		System.out.println();
		List<Integer> list= new ArrayList<>();
		for(int i=0;i<5;i++)
			list.add(i+1);
		sum=list.stream().mapToInt(n->n.intValue()).sum();
	//스트림을 IntStream으로 변환해주는 메서드다.
//	IntStream을 제외한 모든 스트림에서 동일하게 제공하는 메서드다.

		
		System.out.println(sum);
		
		
		
		
		
//		
//		System.out.println(sum);
//		System.out.println(count);
//		
	
	
	
	}
}
