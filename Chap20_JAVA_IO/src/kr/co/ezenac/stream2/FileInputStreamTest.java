package kr.co.ezenac.stream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest {
	public static void main(String[] args) {
		InputStream fis = null;
		try {
			fis=new FileInputStream("input");
			System.out.println(fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fis!=null)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
		
	}
}
