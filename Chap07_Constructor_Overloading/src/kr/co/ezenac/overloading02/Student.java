package kr.co.ezenac.overloading02;
//constructor overloading
public class Student {
	private String name;
	private int age;
	public Student(){
		this(25);//public Student(int age)를 호출
		System.out.println("기본생성자호출");
	}
	public Student(String name) {
		System.out.println("매개변수가 string만 있는 생성자 호출");
		this.name=name;
	}
	public Student(int age) {
		System.out.println("매개변수가 int만 있는 생성자 호출");
		this.age=age;
	}
	public Student(int age, String name) {
		System.out.println("매개변수가 int와 String이 있는 생성자 호출");
		
		this.age=age;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		
		return this.age+" "+this.name;
	}
	
	
}
