package kr.co.ezenac.loop03;

public class statest {
	
	public static void main(String[] args) {
		int [] a= {5,1};
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++){
				if(a[0]==j||a[1]==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");	
				}
				
				
			}
			System.out.println();
			a[0]--;
			a[1]++;
		}
	}


}



