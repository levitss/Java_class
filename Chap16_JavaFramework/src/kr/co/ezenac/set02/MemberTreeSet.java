package kr.co.ezenac.set02;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet  {
	private TreeSet<Member> treeSet;
	public MemberTreeSet() {
		// TODO Auto-generated constructor stub
		treeSet=new TreeSet<>();
	}
	public void addMember(Member member) {//멤버 생성자에서 정보 입력
		treeSet.add(member);
	}
	public boolean removeMember(int id) {
		Iterator<Member> ir=treeSet.iterator();
		while (ir.hasNext()) {
			Member member=ir.next();
			int tmpid=member.getId();
			if(tmpid==id) {
				treeSet.remove(member);
				return true;
			}
			else
				return false;
		}
		return false;
	}
	public void showAllMember() {
		for(Member member:treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	}
	
//	@Override
//	public int compare(Member o1, Member o2) {
//		if(o1.getId()<o2.getId())
//			return -1;
//		if(o1.getId()==o2.getId())
//			return 0;
//		else
//			return 1;
//	}
	

