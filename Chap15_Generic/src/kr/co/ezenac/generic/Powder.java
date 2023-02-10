package kr.co.ezenac.generic;

public class Powder extends Material{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "재료는 powder";
	}

	@Override
	public void doPrint() {
		// TODO Auto-generated method stub
		System.out.println("Powder로 3d출력");
	}
}
