package kr.co.ezenac.set;

import java.util.HashSet;
import java.util.Iterator;

import kr.co.ezenac.list.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet=new HashSet<>();
	}
	public void addMember(Member member) {
		hashSet.add(member);
	}
	public boolean removeMember(int memberid) {
		Iterator<Member> ir=hashSet.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempid=member.getId();
			if(tempid==memberid) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println("해당 id는 존재하지 않음");
		return false;
	}
	public void showAllMember() {
		for(Member member:hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
