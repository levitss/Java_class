package kr.co.ezenac.set02;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	HashMap<Integer,Member> hashMap;
	public MemberHashMap() {
		hashMap=new HashMap<>();
	}
	public void addMember(Member member) {
		hashMap.put(member.getId(), member);
	}
	public boolean removeMember(int id) {
		if(hashMap.containsKey(id)) {
			hashMap.remove(id);
			
			return true;
		}
		System.out.println("id없음");
		return false;
	}
	public void showAllMembers() {
		Iterator<Integer>iterator= hashMap.keySet().iterator();//key값만 set계열로 리턴받음 integer라서
		while (iterator.hasNext()) {//boolean
			int key=iterator.next();
			Member member=hashMap.get(key);//key에 맞는 value 반환
			System.out.println(member);
		}
		System.out.println();
	}
	
}
