package kr.co.ezenac.loop03;

public class arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] beer= {"k","ca","as"};
		System.out.println(beer[1]);
		int [] score= {99,92,93,69,95};
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		double avg=(double)sum/score.length;
		System.out.println(sum);
		System.out.println(avg);
		int [] num=new int[3];
		num[0]=10;
		num[1]=100;
		num[2]=200;
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
				
		

	}
}