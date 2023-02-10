package kr.co.ezenac.object;

public class Student {
	private int id;
	private String name;
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Student) {
//			Student std=(Student)obj;
//			if(this.id==std.id) {//이 경우 일부만 비교함
//			return true;	
//			}else
//				return false;
//		}
//		return false;
//	}
//	@Override
//	public int hashCode() {
//		return id;
//
//	}
}
