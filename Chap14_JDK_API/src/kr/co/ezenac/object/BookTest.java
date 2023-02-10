package kr.co.ezenac.object;

class Book {
	private String title;
	private String author;
	
	public Book(String title,String author) {
		this.author=author;
		this.title=title;
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return title+", "+author;
//	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("hashcode");
		return super.hashCode();
	}
	
	
}
public class BookTest {
	public static void main(String[] args) {
		Book book=new Book("개발자 원칙", "박성철");
		System.out.println(book.toString());//기존 tostring은 주소정보값 반환하니 오버라이딩
		Book bok=new Book("개발자 원칙", "박성철");
		System.out.println(bok.equals(book));//값이 같으니 동등한 개체
		System.out.println(bok.hashCode());
		System.out.println(book.hashCode());
	}
}
