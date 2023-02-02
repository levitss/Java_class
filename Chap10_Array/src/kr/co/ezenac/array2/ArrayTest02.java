package kr.co.ezenac.array2;

import java.util.Arrays;

public class ArrayTest02 {
	public static void main(String[] args) {
		double []darr1=new double[5];
		darr1[0]=1;
		darr1[1]=2;
		darr1[2]=3;
		double mtotal=1;
		for (int i=0;i<darr1.length;i++) {
			mtotal*=darr1[i];//비어있는 arr는 0으로 초기화되기때문에?
		}
		System.out.println(mtotal);
		//System.out.println(Arrays.toString(daar1));
	}
}
