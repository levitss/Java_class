package kr.co.ezenac.innerclass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
		int[]result =Arrays.stream(data)//intstream 생성
				.boxed()//intstream을 stream<integer>로 변경
				//boxed는 intstream같은 원시타입에 대한 스트림 지원을 클래스 타입으로 전환하여 전용으로 실행가능한 기능을 수행하기 위함
				//wrapped이유를 생각해보면 됨
				.filter((a)->a%2==0)//짝수만 뽑아내기
				.distinct()//중복 제거
				.sorted(Comparator.reverseOrder())//역순 정렬
				.mapToInt(Integer::intValue)//Stream<integer>를 intStream으로 변경
				.toArray();//int[]배열로 반환
			
//		
//		HashSet<Integer> d=new HashSet<>();
//		for(int i=0;i<data.length;i++) {
//			if(i%2==0)
//				d.add(data[i]);	
//		}
//		Iterator<Integer> f=d.iterator();
//
		System.out.println(Arrays.toString(result));
		
		
	}
}
