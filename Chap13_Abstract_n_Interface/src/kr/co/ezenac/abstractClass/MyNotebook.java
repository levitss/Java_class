package kr.co.ezenac.abstractClass;

public class MyNotebook extends Notebook {

	@Override
	public void typing() {//디스플레이는 상위 클래스에서 구현해 의무가 사라짐 
		System.out.println("Mynotebook typing");
	}
	@Override
	public void turnOn() {
		
	}
	@Override
	
	
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	}

}
