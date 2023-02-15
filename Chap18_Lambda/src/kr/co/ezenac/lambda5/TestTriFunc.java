package kr.co.ezenac.lambda5;

public class TestTriFunc {
	public static void main(String[] args) {
		TriFunction<Integer, Integer, Integer, Integer> add2=
				(x,y,z)->x+y+z;
		System.out.println(add2.add(5, 8, 9));
		TriFunction<Double, Double, Double, Double> time=
				(x,y,z)->(x*y/z);
		System.out.println(time.add(8.6, 4.4, 3.11));

	}
}
