package kr.co.ezenac.array2;

import java.util.*;

public class ObjectCopyTest {
	public static void main(String[] args) {
		Book [] library=new Book[5];
		Book[] coplib=new Book[5];
		library[0]=new Book("Elegant Univese1","Brian Green");
		library[1]=new Book("Elegant Univese2","Brian Green");
		library[2]=new Book("Elegant Univese3","Brian Green");
		library[3]=new Book("Elegant Univese4","Brian Green");
		library[4]=new Book("Elegant Univese5","Brian Green");
		
		coplib[0]=new Book();
		coplib[1]=new Book();
		coplib[2]=new Book();
		coplib[3]=new Book();
		coplib[4]=new Book();//새 메모리 장소 부여함
		
		//ArrayList<>
		
		for(Book book:library) {
			book.showInfo();
		}
		
		System.out.println("==========================");

		for(Book book:coplib) {
			book.showInfo();
		}
		System.out.println("==========================");

		
		
		
		for(int i=0;i<coplib.length;i++) {
			coplib[i].setAuthor(library[i].getAuthor());
			coplib[i].setTitle(library[i].getTitle());
		}
		for (int i=0;i<library.length;i++) {
			library[i].setAuthor("믹 넛슨");
			library[i].setTitle("String Security");
		}
		for(Book book:library) {
			book.showInfo();
		}
		
		System.out.println("==========================");

		for(Book book:coplib) {
			book.showInfo();
		}
		System.out.println("==========================");
		
		
		
		
		
		
//		
//		System.arraycopy(library, 0, coplib, 0, 5);
//		System.out.println("===========copy library==============");
//		for (Book book : coplib) {
//			book.showInfo();//변수타입 Book이니 showinfo 출력 가능...
//		}
//		System.out.println("===========origin library==============");
//		System.arraycopy(library, 0, coplib, 0, 3);
//		for(Book book : library) {
//			book.showInfo();
//		}
//		
//		
//		
//		
//		System.out.println("library Author는"+library[2].getAuthor());
//		System.out.println("coplib Author는"+coplib[2].getAuthor());
//		
//		coplib[2].setAuthor("test");
//		System.out.println("===========origin library==============");
//
//		System.out.println("library Author는"+library[2].getAuthor());
//		System.out.println("===========copy library==============");
//
//		System.out.println("coplib Author는"+coplib[2].getAuthor());
//		
//		
		
	}
}
