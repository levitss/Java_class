package kr.co.ezenac.list;

import java.util.ArrayList;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList a=new MemberArrayList();
		Member memberl=new Member("L", 3);
//		a.addMember(new Member("Lee", 1));
//		a.addMember(new Member("Shin", 2));
//		a.addMember(new Member("Tes",4));
		ArrayList<String> name=new ArrayList<>();
		name.add("A");
		name.add("b");
		name.add("c");
		name.add("d");
		for(int i=0; i<name.size();i++) {
			a.addMember(new Member(name.get(i), i));
		}
		
		
		a.addMember(memberl);
		a.showMember();
		a.removeMember(1);
		a.removeMember(3);
		a.showMember();
		a.showMember();
	}
}
