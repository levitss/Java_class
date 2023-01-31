package kr.co.ezenac.memory;

public class MemoryInHeapTest {
	public static void main(String[] args) {
		Book book1=new Book();
		Book book2=new Book();
		
		book1.num=10;
		book2.num=20;//instance variable 인스턴스가 생성될 때 같이 생성되는 변수. 클래스변수와는 다름.
		System.out.println(book1.num);
		System.out.println(book2.num);
		book1=null;
		book2=null;
		
		
		
		
	}

}
