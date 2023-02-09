package kr.co.ezenac.interface6;

public class Mybookshelf extends BookShelf implements Queue {

	
	@Override
	public void enQueue(String title) {
		bookshelf.add(title);
		
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		return bookshelf.remove(0);//선입선출
		
	}
	
}
