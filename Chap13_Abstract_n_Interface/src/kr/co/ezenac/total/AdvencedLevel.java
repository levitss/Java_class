package kr.co.ezenac.total;

public class AdvencedLevel extends PlayerLevel {

	
	public AdvencedLevel() {
//		count=2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("빠르게 달림");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("높이 점프 합니다");
		
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("turn 못함"); 

	}

	@Override
	public void showlevel() {
		// TODO Auto-generated method stub
		System.out.println("***************중급자 레벨****************");

	}

}
