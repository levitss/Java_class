package kr.co.ezenac.array05;

public class NDimensionTest {
	public static void main(String[] args) {
		int arr3 [][]= new int [3][3];
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				arr3[i][j]=j+i;
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println("\t"+arr3[i].length);
		}
		
		
		
		int arr [][]= new int [][] {
			{11,22,33},
			{44,55,66},
			{77,88,99}
		};
		
		
	}
}
