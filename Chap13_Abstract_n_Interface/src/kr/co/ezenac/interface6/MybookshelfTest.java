package kr.co.ezenac.interface6;

public class MybookshelfTest {
	public static void main(String[] args) {
		Queue bQueue=new Mybookshelf();
		
		bQueue.enQueue("반지의 제왕");
		bQueue.enQueue("호빗");
		bQueue.enQueue("총균쇠");
		
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		
		System.out.println();
		
	}
}
