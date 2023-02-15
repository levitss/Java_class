package kr.co.ezenac.innerclass;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStream {
	String[] arr=new String[] {"a","b","c"};
	Stream<String> st=Arrays.stream(arr);
	Stream streamOfArrayPart=Arrays.stream(arr,1,3);
	
}
