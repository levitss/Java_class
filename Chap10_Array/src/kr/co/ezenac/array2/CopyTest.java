package kr.co.ezenac.array2;

public class CopyTest {
	private String name;
	private int age;
	private CopyTest() {}
	public void person(String name,int age) {
		this.age=age;
		this.name=name;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
	
