package kr.co.ezenac.list;

import java.util.ArrayList;
import java.util.Iterator;

//Member 클래스로 생성된 인스턴스를 관리하는 클래스를 컬랙션 프레임 워크 클래스 활용하여 구현함
public class MemberArrayList {
	private ArrayList<Member> arrayList;
	public MemberArrayList() {
		arrayList=new ArrayList<>();
	}
	public void addMember(Member member) {
		arrayList.add(member);
	}
	public boolean removeMember(int id) {

//		for(int i=0; i<arrayList.size();i++) {
//			Member member=arrayList.get(i);
//			int tempid=member.getId();
//			if(tempid==id) {
//				arrayList.remove(i);
//				
//				return true;
//				
//			}
//		}
//		
		Iterator<Member> ir=arrayList.iterator();
		while(ir.hasNext()) {
			Member mem=ir.next();
			int tempid=mem.getId();
			if(tempid==id) {
				arrayList.remove(mem);
				
				return true;
			}
		}
		System.out.println(id+"가 존재하지 않음");
		System.out.println();
		return false;
	}
//	public void delMember(int id) {
//		arrayList.remove(arrayList.indexOf(id));//멤버 클래스 형식이 아님
//	}
	public void showMember() {
		for(Member mem:arrayList) {
			System.out.println(mem);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
//		ArrayList<Member> mem = null;
//		mem.add(new Member("Lee", 1));
//		mem.add(new Member("Lee", 2));
//		System.out.println(mem.toString());
		MemberArrayList n=new MemberArrayList();
		
		
		
		
		
	}
}
