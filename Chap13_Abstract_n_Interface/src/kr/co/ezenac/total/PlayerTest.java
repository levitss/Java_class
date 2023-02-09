package kr.co.ezenac.total;

public class PlayerTest {
	public static void main(String[] args) {
		Player player1=new Player();
		player1.play(1);
		PlayerLevel aLevel=new AdvencedLevel();
		player1.upgradeLevel(aLevel);
		player1.play(2);
		PlayerLevel sLevel=new SuperLevel();
		player1.upgradeLevel(sLevel);
		player1.play(3);
		
		
		
//		PlayerLevel p1=new BeginnerLevel();
//		p1.showlevel();
//		p1.go();
//		PlayerLevel p2=new AdvencedLevel();
//		p2.showlevel();
//		p2.go();
//		PlayerLevel p3=new SuperLevel();
//		p3.showlevel();
//		p3.go();
	}
}
