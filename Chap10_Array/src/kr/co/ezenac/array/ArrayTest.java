package kr.co.ezenac.array;



class Box{
	
}

public class ArrayTest {
	public static void main(String[] args) {
		//길이가 5인 int형 1차원 배열
		int []arr=new int [5];
		//생성과 함께 초기화
		int []arr4=new int[] {2,3,4,5,6};
		int []arr1= {1,2,3};//new 생략 엄밀히는 생성과정이 같지 않음  같은 값 있으면 이전 주소값을 참조함.
		for (int i=0;i<arr.length;i++) {
			arr [i]=i+1;
			System.out.println(arr[i]);
		}
		//배열 선언 후 후에 배열 생성 가능
		int [] arr7777;
		arr7777=new int[3];//이건 생략 안됨
		
		
		
		//length 7 double type arr5
		double [] arr5=new double [7];
		//length 9 flaot arr6
		float [] arr6;
		arr6=new float [9];
		//객체 1차 배열
		Box[] arr7=new Box[5];
		for (int i=0;i<arr7.length;i++) {
			arr7[i]=new Box();
		}
		
		/*다른 배열은 heap에 메모리값
		 * 객체 배열은 heap에 참조 위한 주소값이 들어있음
		 * 	
		 */
	}

}
