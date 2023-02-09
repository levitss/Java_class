package kr.co.ezenac.total;

public class Player {
	private PlayerLevel level;
	public Player() {
		level=new BeginnerLevel();
		level.showlevel();
	}
	public PlayerLevel getLevel() {
		return level;
	}
	public void play(int count) {
		level.go(count);
	}
	public void upgradeLevel(PlayerLevel level) {
		 this.level=level;//덮어쓰기
		 level.showlevel();
	}
		
}
