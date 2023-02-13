package kr.co.ezenac.list;

public class Member {
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
	
	
}
