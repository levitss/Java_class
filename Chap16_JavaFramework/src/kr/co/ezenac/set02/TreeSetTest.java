package kr.co.ezenac.set02;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet=new TreeSet<>();//비선형
		treeSet.add("1");
		treeSet.add("2");
		treeSet.add("lee");
		treeSet.add("Shin");
		treeSet.add("Shin");
		treeSet.add("76");
		treeSet.add("-5");
		for(String str:treeSet) {
			System.out.println(str);
		}
//		TreeSet<Member> mem=new TreeSet<>();
//		Member mem1=new Member("eee", 0);
//		mem.add(new Member("lee", 0));
//		mem.add(new Member("lee3", 1));
//		mem.add(new Member("lee2", 3));
//		mem.add(mem1);
//		System.out.println(mem);
	}
}
