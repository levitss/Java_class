package kr.co.ezenac.set;

import kr.co.ezenac.list.Member;

public class MemberHashsetTest {
	public static void main(String[] args) {
		MemberHashSet hs = new MemberHashSet();
		hs.addMember(new Member("lee", 1));
		Member m=new Member("a", 0);
		Member m1=new Member("b", 1);
		Member m2=new Member("c", 2);
		Member m3=new Member("a", 0);
		hs.addMember(m);
		hs.addMember(m1);
		hs.addMember(m3);
		
		hs.showAllMember();
		//논리적 동등함을 재정의하지 않아서 같은 값으로 인식을 못하고 있는 상황// 현재는 hash값이 다른게 기준
		//Member 클래스에서 equals hashcode 재정의
		
		
		
		
		
	}
}
