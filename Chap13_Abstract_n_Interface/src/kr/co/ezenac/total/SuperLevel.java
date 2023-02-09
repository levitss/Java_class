package kr.co.ezenac.total;

public class SuperLevel extends PlayerLevel{

	public SuperLevel() {
//		count=3;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("아주 빠르게 달림");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("아주 높이 점프 합니다");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("turn가능");
	}

	@Override
	public void showlevel() {
		// TODO Auto-generated method stub
		System.out.println("***************상급자 레벨****************");

	}

}
