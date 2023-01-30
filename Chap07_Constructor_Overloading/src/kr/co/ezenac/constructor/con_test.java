package kr.co.ezenac.constructor;

public class con_test {
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
