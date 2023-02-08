package kr.co.ezenac.interface1;

public class RemoteTest {
	public static void main(String[] args) {
		RemoteControl rc1=new Audio();
		rc1.setVolume(15);
		rc1.setVolume(-555);
		rc1.setVolume(5);
		System.out.println();
		rc1.setiVolume(true);
		rc1.setiVolume(true);
		System.out.println();
		RemoteControl rc2=new Tv();
		rc2.setiVolume(false);
		rc2.setiVolume(true);
		rc2.setiVolume(true);
		rc2.setiVolume(true);
		rc2.setiVolume(false);
		
		
	}
}
