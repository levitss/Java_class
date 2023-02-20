package kr.co.ezenac.stream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream02 {
	public static void main(String[] args) {
		try(InputStream fis=new FileInputStream("input")){
			int i;
			while((i=fis.read())!=-1){
				//파일의 끝까지 한바이트씩 자료 읽기
				System.out.print((char)i);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("end");
	}
}
