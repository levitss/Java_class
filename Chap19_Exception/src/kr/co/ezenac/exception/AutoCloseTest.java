package kr.co.ezenac.exception;

public class AutoCloseTest implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closed");
	}
	
	
}
