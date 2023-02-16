package kr.co.ezenac.exception;

public class ArrayException {
	public static void main(String[] args) {
		int[]arr=new int[5];
		try {
			arr[6]=56;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외처리");
		}
		
		
	}
}
