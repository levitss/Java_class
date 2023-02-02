package kr.co.ezenac.array2;

public class ObjectCopyTest {
	public static void main(String[] args) {
		Book [] library=new Book[5];
		Book[] coplib=new Book[5];
		library[0]=new Book("Elegant Univese1","Brian Green");
		library[1]=new Book("Elegant Univese2","Brian Green");
		library[2]=new Book("Elegant Univese3","Brian Green");
		library[3]=new Book("Elegant Univese4","Brian Green");
		library[4]=new Book("Elegant Univese5","Brian Green");
		
		System.arraycopy(library, 0, coplib, 0, 5);
		System.out.println("===========copy library==============");
		for (Book book : coplib) {
			book.showInfo();//변수타입 Book이니 showinfo 출력 가능...
		}
		
		
		
		
		
		System.out.println("library Author는"+library[2].getAuthor());
		System.out.println("coplib Author는"+coplib[2].getAuthor());
		
		coplib[2].setAuthor("test");
		
		System.out.println("library Author는"+library[2].getAuthor());
		System.out.println("coplib Author는"+coplib[2].getAuthor());
		
		
	}
}
