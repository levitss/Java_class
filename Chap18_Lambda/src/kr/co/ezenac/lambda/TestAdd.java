package kr.co.ezenac.lambda;

import java.util.function.BiFunction;

public class TestAdd {
	public static void main(String[] args) {
		
		Add addf=(int x,int y) -> {return x+y;};
		Add add1=(x,y) -> x+y;
		Add add2=Integer::sum;
		//어떤 클래스의 메서드를 사용할 때 ::로 클래스와 메서드를 구분하여 표기함
		
		System.out.println(add1.add(1, 2));
//		System.out.println(add1.getClass());
		
		System.out.println(add2.add(3, 0));
		
		
		BiFunction<Integer, Integer, Integer> mc=(a,b)->a+b;
		BiFunction<Integer, Integer, Double>m2=(a,b)->(double)a+b;
		//a,b, result 순
		
		
		
		int result=mc.apply(3, 4);
		
		System.out.println(result);
	}
}
