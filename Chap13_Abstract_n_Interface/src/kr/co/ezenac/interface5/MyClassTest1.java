package kr.co.ezenac.interface5;

public class MyClassTest1 {
	public static void main(String[] args) {
		ClassTest cl=new ClassTest();
		X xclass = cl;
		xclass.x();
		Y yc=cl;
		yc.Y();
		Z zc=cl;
		zc.Z();
		zc.x();
		zc.Y();
		
		ClassTest nc=cl;
		
	}
}
