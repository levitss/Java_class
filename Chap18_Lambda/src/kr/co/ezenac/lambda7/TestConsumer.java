package kr.co.ezenac.lambda7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class TestConsumer {
	public static void main(String[] args) {
		//return 없음
		Consumer<String> myCon=s->System.out.println(s);
		myCon.accept("test");//단순 동작
		
		List<Integer> list= Arrays.asList(4,2,1);//immutable 화
		//.add(5); 
		//list.remove(2);
		
		Consumer<Integer> myc=c->System.out.println("정수형 입력 처리:"+c);
		myc.accept(5);
		
		consumerAccept(list, myc);
		List<Double> dlist= Arrays.asList(1.1,2.2,3.3);
		Consumer<Double>myd=d->System.out.println("실수형 입력 처리"+d);
		
		consumerAccept(dlist, myd);
		
	}
	public static <T> void consumerAccept(List<T> inputs,Consumer<T> consumer) {
		for (T input : inputs) {
			consumer.accept(input);
		}
		
	}
}
