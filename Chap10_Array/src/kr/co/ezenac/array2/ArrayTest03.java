package kr.co.ezenac.array2;

public class ArrayTest03 {
	public static void main(String[] args) {
		double []dArr1=new double[5];
		int count=0;
		dArr1[0]=1.1; count++;
		dArr1[1]=2.2;	count++;	
		dArr1[2]=3.3;	count++;
		int mtotal=1;
		for(int i=0; i<count;i++) {
			mtotal*=dArr1[i];
			System.out.println(mtotal);
		}
		
		
		
	}
}
