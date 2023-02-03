package kr.co.ezenac.array04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddArray {
	public static void main(String[] args) {
		String []arr= {"a","b","c"};
		String newValue="C";
		int position=2;
		//list는 동적임 array는 정적
		List<String>list=new ArrayList<>(Arrays.asList(arr));//list 변환
		list.add(position,newValue);
		//list to String
		arr=list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
