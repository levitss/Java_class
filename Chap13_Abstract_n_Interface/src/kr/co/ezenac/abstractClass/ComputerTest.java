package kr.co.ezenac.abstractClass;

public class ComputerTest {
	public static void main(String[] args) {
//Computer com1=new Computer(); 추상클래스는 객체화는 못하지만 클래스 타입이 될 수 는 있음 
		Computer com2=new Desktop();
		com2.display();
		Notebook myNote=new MyNotebook();
		myNote.typing();
		myNote.display();
	}
}
