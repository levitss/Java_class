package kr.co.ezenac.arrayList;

import java.util.ArrayList;

import kr.co.ezenac.array2.Book;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Book>lib=new ArrayList();
		lib.add(new Book("자바의 정석", "홍성대"));
		lib.add(new Book("그림으로 배우는 StatQuest","조시"));
		lib.add(new Book("Jump to Java","wiki"));
		lib.add(new Book("jump to python", "wiki2"));
		for(int i=0;i<lib.size();i++) {
			lib.get(i).showInfo();//lib.get(1)=lib[1] 문자열의 인덱스가 아니라 배열의 인덱스
			System.out.println(lib.get(i));
			
		}
	}
}
