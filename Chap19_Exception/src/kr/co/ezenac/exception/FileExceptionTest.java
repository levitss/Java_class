package kr.co.ezenac.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionTest {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream st=null;
		try {
			st=new FileInputStream("ezen19.txt");	
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());	//빨간색 경고
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}		
		finally {
			try {
				if(st!=null)
					st.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("정상 수행");
		
		
	}
}
