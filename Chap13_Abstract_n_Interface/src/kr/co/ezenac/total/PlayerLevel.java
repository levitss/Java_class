package kr.co.ezenac.total;

public abstract class PlayerLevel {
	/*
	 * 초급자 레벨
	 * 천천히 달립니다
	 * jump 못함
	 * turn 못함
	 * 
	 * 중급자
	 * 빠르게 달립니다.
	 * 높이 jump합니다.
	 * 높이 jump합니다.
	 * turn 못함
	 * 
	 * 상급자
	 * 아주 빠르게 달립니다.
	 * 높이 jump합니다.
	 * 높이 jump합니다.
	 * 높이 jump합니다.
	 * turn 가능
	 */
//	int count;
	public final void go(int count) {
		run();
		for(int i=0;i<count;i++) {
			jump();
		}
		turn();	
	}
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showlevel();
	
}
