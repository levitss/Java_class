package ezenac;

import java.util.ArrayList;

public class Student1 {
	private String stName;
	ArrayList<Book> booklist;
	public Student1 (String name) {
		this.stName=name;
		booklist=new ArrayList<>();
	}
	public void addBook(String bookTitle) {
		Book book=new Book();
		book.setTitle(bookTitle);
		this.booklist.add(book);
	}
	public void showInfo() {
		ArrayList<String> list=new ArrayList<>();

		for(Book book:booklist) {
			list.add(book.getTitle());
		}
		System.out.println(stName+"이 읽은 책은"+list.toString());
	}
	
}
