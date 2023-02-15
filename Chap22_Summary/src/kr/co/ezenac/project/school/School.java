package kr.co.ezenac.project.school;

public class School {
	private School() {}
	private static School instance=new School();
	public static School getInctance() {
		if(instance==null)
		instance=new School();
		return instance;
	}
	
}
