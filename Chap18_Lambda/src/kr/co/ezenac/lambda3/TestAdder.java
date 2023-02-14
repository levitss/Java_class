package kr.co.ezenac.lambda3;

import java.util.function.Function;

public class TestAdder {
	public static void main(String[] args) {
		Function<Integer, Integer> add=new Adder();
		Function<Integer, Integer> addd=x->x+5;
		int r=add.apply(20);
		System.out.println(r);
		System.out.println(addd.apply(r));
	}
}
