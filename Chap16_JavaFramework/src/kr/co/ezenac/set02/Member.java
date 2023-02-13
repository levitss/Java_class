package kr.co.ezenac.set02;

public class Member implements Comparable<Member>{
	private String name;
	private int id;
	public Member(String name,int id) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+". "+name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member=(Member)obj;//downcasting
			if(this.id==member.id)
				return true;
			else
				return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}

	//compareto 
	//컬렉션에 있는 것과 파라미터로 넘어오는 것 비교하여 내 것이 크면 양수 적으면 음수 같으면 0

	
	@Override
	public int compareTo(Member o) {
		if(this.id>o.getId())
			return 1;
		if(this.id<o.getId())
			return -1;
		return 0;
	}
	
	

	
}
