package kr.co.ezenac.array05;

public class ThreeDimension {
	public static void main(String[] args) {
		int arr[][][]=new int [12][5][7];
		for(int month=0;month<arr.length;month++) {
			int day=1;
			System.out.println("/t/t/t"+(month+1)+"월");//월 출력
			for(int week=0;week<arr[month].length;week++) {
				for(int j=0;j<arr[month][week].length;j++) {//j는 w주 n번째 날
					arr[month][week][j]=day++;	
				}
				
			}
		}
		
	}
}
