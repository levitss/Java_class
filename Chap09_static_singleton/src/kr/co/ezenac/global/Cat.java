package kr.co.ezenac.global;

public class Cat {
	int num=3;
	static int a=5;
	public void printValue(int num) {
		this.num=num;
		System.out.println("num="+this.num);
		System.out.println("a="+a);
	
	}
	public static void main(String[] args) {
		int a;//local variable 선언 가능.
		a=Cat.a;
		int n1=5;
		int n2=2;
		System.out.println(n1+","+n2);
		Cat cat1=new Cat();//default constructor  //cat1은 stack에 생성. 내용은 heap에 객체 생성.
		cat1.num=1;
		cat1.a=10;
		cat1.printValue(20);
		System.out.println("cat1.num="+cat1.num);
		System.out.println("cat1.a="+cat1.a);
		System.out.println();
		Cat cat2=new Cat();
		cat2.num=2;
		cat2.a=11;
		System.out.println("cat2.a="+cat2.a);
		System.out.println("cat1.a="+cat1.a);
		
	}
}
