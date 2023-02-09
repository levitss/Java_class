package kr.co.ezenac.interface6;

import java.util.ArrayList;

public class BookShelf {
/*
 * 책이 순서대로 대여가 되는 책장
 * 	책을 보관하는 자료 구조(data structure)가 구현됨 (Arraylist)//array와의 차이= list는 동적임
 */
	protected ArrayList<String> bookshelf;
	public BookShelf(){
		bookshelf=new ArrayList<>();
	}
	public ArrayList<String> getBookshelf(){
		return bookshelf;
	}
	
	public int getCount() {
		return bookshelf.size();
	}
	
	
	
}
