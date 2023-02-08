package kr.co.ezenac.interface1;

public class CalcClass implements Calc {

	@Override
	public int add(int num1, int num2) {
		
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		
		return num1-num2;
	}

	@Override
	public int time(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double divide(double num1, double num2) {
		// TODO Auto-generated method stub
		return 0.0;
	}




}
