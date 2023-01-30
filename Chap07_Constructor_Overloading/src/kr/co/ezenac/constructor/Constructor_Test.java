package kr.co.ezenac.constructor;
class Book{//default access control modifiers=같은 패키지내에서 사용됨.
	String title;
	int price;
	int num;
	//default constructor
	public Book() {//생성자 명이 클래스와 같음
		this.title="The Lord Of The Rings";
		this.price=35000;
	}
	//constructor overloading
	//기본 생산자 매개변수 없는
	public Book (String title,int p) {
		this.title=title;
		price=p;//중복이 안되어서 this가 생략됨.
		
	}
	//method add
	public void print() {
		System.out.println("타이틀:"+this.title);
		System.out.println("가격:"+this.price);
		System.out.println("주문수량:"+num);
		System.out.println("구매합:"+(price*num));
	}
}


public class Constructor_Test {
	public static void main(String[] args) {//본래는 따로 클래스 만들어서 사용해야함.
		Book book=new Book();
		book.print();
		System.out.println();
		
		Book book2=new Book("Hobit", 30000);
		book2.num=10;
		book2.print();
		System.out.println();
		
		Book book3=new Book();
		book3.price=5000;
		book3.title="NLPwithPython";
		book3.num=5;
		book3.print();
		
	}
}
