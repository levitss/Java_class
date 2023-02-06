package kr.co.ezenac.arrayList02;

import java.util.ArrayList;
import kr.co.ezenac.array2.Book;

public class Student {
	private String stName;
	
	ArrayList<Book> booklist;
	public Student(String name) {
		this.stName=name;
		booklist=new ArrayList<>();
	}
	public void addBook(String title){//읽은책 추가 메서드
		Book book=new Book();//book에 값을 넣기 위함
		book.setTitle(title);
		this.booklist.add(book);//객체 book의 값을 list에 추가
	}
	public void showInfo() {
		System.out.print(this.stName+"학생이 읽은 책은 : ");
		ArrayList<String> list=new ArrayList<>();
		for(Book book:booklist) {//list 만들어서 마지막 자르기?//list는 따로 ,안넣어도 ,으로 구분이 됨....
			list.add(book.getTitle());
//			list.add(", ");
		}
//		list.remove(list.size()-1); 
		System.out.println(list.toString()+"입니다");//toString override 하면 괄호 없앨 수 있음
	}
	
}
