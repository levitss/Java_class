package kr.co.ezenac.interface4;

public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("구매");
	}
}