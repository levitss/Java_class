package kr.co.ezenac.thread4;

import java.util.ArrayList;


//class Book {
//	ArrayList<String> titleList=new ArrayList<String>();
//	
//}

class EzenBooks{
	public ArrayList<String> shelf=new ArrayList<>();
	public EzenBooks() {
		// TODO Auto-generated constructor stub
		shelf.add("딥러닝을 위한 엔비디아 가이드북 1");
		shelf.add("딥러닝을 위한 엔비디아 가이드북 2");
		shelf.add("딥러닝을 위한 엔비디아 가이드북 3");
		shelf.add("딥러닝을 위한 엔비디아 가이드북 4");
		shelf.add("딥러닝을 위한 엔비디아 가이드북 5");
	}
	
	
	//queue
	public synchronized String rentBook() {
		String book=shelf.remove(0);
		System.out.println(Thread.currentThread().getName()+" : "+book+" 빌림");
		return book;
	}
	public synchronized void returnBook(String book) {
		shelf.add(book);
		System.out.println(Thread.currentThread().getName()+" : "+book+" 반납");
	}
	
}
class Person extends Thread{
	@Override
	public void run() {
		String title=SyncWaitNotifyTest.ezenBooks.rentBook();

		try {
			if(title==null){//남은 책이 없을때
				System.out.println(Thread.currentThread().getName()+"책 못빌림");
				return;
			}	
			Thread.sleep(5000);//읽음
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		SyncWaitNotifyTest.ezenBooks.returnBook(title);
	//빌리고 읽고 반납하는 동작을 하나로 정의
		
		
	
	}
	
	
	
	
}
public class SyncWaitNotifyTest {
	public static EzenBooks ezenBooks=new EzenBooks();
	
	
	public static void main(String[] args) {
		ArrayList<Person> plist=new ArrayList<>();
		for (int i=0; i<6;i++) {
			plist.add(new Person());
		}
		for(int i=0;i<plist.size();i++) {
			plist.get(i).start();
		}
		
		
	}
}
