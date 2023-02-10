package kr.co.ezenac.genericmethod;

import java.util.ArrayList;

public class GenericMethodTest {
	public static <T,V>double makeRectangle(Point<T, V> p1, Point<T, V> p2){
		double left=((Number)p1.getX()).doubleValue();
		double right=((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom=((Number)p2.getY()).doubleValue();
		double width=right-left;
		double height=bottom-top;
		
		return width*height;
	}
	
	
	
	public static void main(String[] args) {
		
		Point<Integer,Double> p2=new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double>p1=new Point<Integer, Double>(5, 5.7);
		System.out.println(makeRectangle(p1, p2));
		
		ArrayList<Integer> e=new ArrayList<>();
		e.add(5);
		e.add(5);
		e.add(5);
		e.add(5);
		System.out.println(e);
	}
}
