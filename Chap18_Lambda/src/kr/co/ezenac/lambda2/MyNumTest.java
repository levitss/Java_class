package kr.co.ezenac.lambda2;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public interface MyNumTest{
	public static void main(String[] args) {
		MyNumber w=(a,b)->(a>b)?a:b;
		System.out.println(w.getMax(50, 50));
		
		BinaryOperator<Integer> mc= (a,b)->a+b;
		BiFunction<Integer, Integer, Float> ms=(a,b)->(float)a/b;
		
	}
}
