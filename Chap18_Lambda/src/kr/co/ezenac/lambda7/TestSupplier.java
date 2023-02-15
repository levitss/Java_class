package kr.co.ezenac.lambda7;


import java.util.function.Supplier;

public class TestSupplier {
	public static void main(String[] args) {
		Supplier<String> g=()->"return";
		System.out.println(g.get());
		Supplier<Double> d=()->Math.PI;
		System.out.println(d.get());
		Supplier<Double> s=()->Math.log((Math.random()*10));
		//매개변수 람다식 활용 횟수
		
		mm(s, 5);
		
		
	}
	public static void mm(Supplier<Double> s,int e) {
		for(int i=0;i<e;i++) {
			System.out.println(s.get());
		}
	}
	
}
