package kr.co.ezenac.set02;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap a=new MemberHashMap();
		Member member=new Member("lee", 1);
		Member member1=new Member("lee", 2);
		Member member2=new Member("lee", 3);
		Member member3=new Member("lee", 4);
		a.addMember(member);
		a.addMember(member1);
		a.addMember(member2);
		a.addMember(member3);
		a.showAllMembers();
		a.removeMember(1);
		a.showAllMembers();
		System.out.println(a.hashMap.get(1));
		System.out.println(a.hashMap.get(2));//member의 tostring override 때문에 
	}
}
