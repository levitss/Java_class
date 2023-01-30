package kr.co.ezenac.infoHiding;

import java.util.Scanner;

class Student1{
	String name;
	int age;
}//default constructor
class Student2{
	public String name;
	private int age;
	//overloading
	public Student2(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public int getAge() {
		return age;//같은 클래스라서 접근 가능
	}
	public void setAge(int age) {
		if(age<0||age>200) { //유효성 검사
			System.out.println("나이가 부적절");
			this.age=0;
			return;			
		}
		this.age=age;
			
		
	}
}
public class PrivateTest {
	public static void main(String[] args) {
		Student1 st1= new Student1();
		st1.name="lee"; //멤버변수에 다이렉트로 접근을 한 경우
		st1.age =20;
		System.out.printf("%s의 나이는 %d살%n",st1.name,st1.age);
		
		Student2 st2=new Student2("jin", 21);
		st2.name="yoon";
		//st2.//private라 age는 안보임
		System.out.printf("%s의 나이는 %d살%n",st2.name,st2.getAge());//우회로 접근
		
		st2.setAge(-1);
125p		
		
		
		
	}
}
