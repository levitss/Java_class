package kr.co.ezenac.array;

public class StringArrayTest {
	public static void main(String[] args) {
		//문자열은 특수 객체배열과 비슷하게 적용됨 바로 heap에 저장되는게 아닌 heap에 참조 주소 저장됨 4byte
		String [] arr1=new String[5];
		int countNum1=0;
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=new String("test");
			System.out.println(arr1[i]);
			countNum1+=arr1[i].length();
		}
		System.out.println(countNum1);
//		for (String arr:arr1) {
//			System.out.println(arr);
//		}
//		for (int i=0;i<arr1.length;i++) {
//			arr1[i]="test1";
//			System.out.println(arr1[i]);
//		}
		
		
	}
}
