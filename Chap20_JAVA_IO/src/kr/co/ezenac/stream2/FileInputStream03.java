package kr.co.ezenac.stream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream03 {
	public static void main(String[] args) {
		try(InputStream fis=new FileInputStream("input2")){
			byte[]bs=new byte[10];
			int i;
			while((i=fis.read(bs))!=-1) {
				//파일에서 바이트 배열씩 자료 읽기
//				for(byte b:bs) {
//					System.out.print((char)b);
//				}
				for(int k=0; k<i;k++)
					System.out.print((char)bs[k]);
				System.out.println(":"+i+"바이트 읽음");
			}//남아있는 자료만 
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
