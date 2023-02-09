package kr.co.ezenac.total;

public class BeginnerLevel extends PlayerLevel{

	
	public BeginnerLevel() {
//		count=1;
	}
	@Override
	public void run() {
			// TODO Auto-generated method stub
		System.out.println("천천히 달립니다");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("jump 못함");
		

	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("turn 못함"); 

	}

	@Override
	public void showlevel() {
		// TODO Auto-generated method stub
		System.out.println("***************초급자 레벨****************");
	}

}
