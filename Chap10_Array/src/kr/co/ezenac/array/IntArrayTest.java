package kr.co.ezenac.array;

public class IntArrayTest {
	public static void main(String[] args) {
//		//길이3 int
//		int[] arr1=new int[3];
//		//값 저장
//		arr1[0]=100;
//		arr1[1]=60;
//		arr1[2]=8;
//		int sum=0;
//		for (int i=0;i<arr1.length;i++) {
//			sum+=arr1[i];
//			System.out.println(sum);
//		}
		int [] arr2=new int [10];
		int total=0;
//		for (int i=0, num=1;i<arr2.length;i++,num++) {
//			arr2[i]=num;
//			total+=arr2[i];
////			System.out.println(arr2[i]);
////		}
		total=0;
		for (int i=0;i<arr2.length;i++) {
			arr2[i]=i+1;
			total+=arr2[i];
			System.out.print(arr2[i]+" \t");
			System.out.print(total+"\n");
			
		}
		
	}
}
