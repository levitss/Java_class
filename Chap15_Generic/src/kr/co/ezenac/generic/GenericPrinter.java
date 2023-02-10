package kr.co.ezenac.generic;
//이 클래스를 사용하는 시점에 실제 사용할 자료형을 지정함
public class GenericPrinter <T extends Material>{
	private T material;//제네릭 자료형 (T자료형) 

	public T getmaterial() {//T자료형을 반환
		return material;
	}

	public void setmaterial(T material) {
		this.material = material;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}
	public void printing() {
		material.doPrint();
	}
}
