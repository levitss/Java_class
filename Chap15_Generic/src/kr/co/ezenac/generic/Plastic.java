package kr.co.ezenac.generic;

public class Plastic extends Material {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "재료는 플라스틱";
	}

	@Override
	public void doPrint() {
		// TODO Auto-generated method stub
		System.out.println("Plastic으로 3d 출력");
	}
}
