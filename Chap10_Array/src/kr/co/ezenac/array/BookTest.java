package kr.co.ezenac.array;

public class BookTest {
	public static void main(String[] args) {
		Book[] b=new Book[3];
		for(int i=0;i<b.length;i++) {
			b[i]=new Book();
		}
		b[0].title="국어";
		b[0].price=500;
		for(int i=0;i<b.length;i++) {
			b[i].showPrice();
		}
	}
}
