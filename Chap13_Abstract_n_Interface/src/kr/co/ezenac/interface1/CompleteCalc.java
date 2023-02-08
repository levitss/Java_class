package kr.co.ezenac.interface1;

public class CompleteCalc extends CalcClass implements Calc{

	@Override
	public int time(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public double divide(double num1, double num2) {
		if(num2==0) {
			return ERROR;
		}
		else return num1/num2; 
	}
	
}
