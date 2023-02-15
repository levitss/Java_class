package kr.co.ezenac.lambda5;

import java.util.function.BiFunction;

public class TestBiFunction {
	public static void main(String[] args) {
		//함수를 변수처럼 사용하는 경우 - 인터페이스형 변수에 람다식 대입하기
		BiFunction<Integer, Integer, Integer> add=
				(x,y)->x+y;
		System.out.println(add.apply(2, 5));
	}
}
