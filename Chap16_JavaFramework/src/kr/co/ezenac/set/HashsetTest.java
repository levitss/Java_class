package kr.co.ezenac.set;

import java.util.HashSet;
import java.util.Iterator;

import kr.co.ezenac.list.MemberArrayListTest;

public class HashsetTest {
	public static void main(String[] args) {
		HashSet<String> hashset=new HashSet<>();
		hashset.add("a");
		hashset.add("b");
		hashset.add("c");//heap에 있는 String pool 
		hashset.add(new String("d"));//heap에 새 String 객체
		hashset.add("a");
		
		
		HashSet a=new HashSet<>();
		a.add(1);
		a.add("test");
		System.out.println(a);
		System.out.println(hashset);
//		a.addAll(hashset);
		
		
		
		
		
		System.out.println(a);
		
	}
}
