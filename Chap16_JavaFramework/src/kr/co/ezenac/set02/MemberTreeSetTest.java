package kr.co.ezenac.set02;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet ts=new MemberTreeSet();
		Member member=new Member("dd", 1);
		Member member1=new Member("tt", 2);
		Member member2=new Member("tyy", 3);
		
		ts.addMember(member);
		ts.addMember(member1);
		ts.addMember(member2);
		ts.showAllMember();
		//comparable 구현이 안되어있어서 오류남 //정렬기준
	}
}
