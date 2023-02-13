package kr.co.ezenac.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		List<String> s=new LinkedList<>();
		LinkedList<String> myList=new LinkedList<>();//뒤에 있는 <>에는 앞에 선언한게 들어가니 생략해도 됨
		List<String> myArLst=new ArrayList<>();
		
		s.add("test");
		myList.add("ss");
		myList.add("sss");
		myList.remove(1);
		
		
		
		System.out.println(myList);
	}
}
