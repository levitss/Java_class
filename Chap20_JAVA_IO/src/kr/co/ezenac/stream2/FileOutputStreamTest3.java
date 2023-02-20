package kr.co.ezenac.stream2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest3 {
	public static void main(String[] args) throws FileNotFoundException {
		
		
		OutputStream fos=new FileOutputStream("output4.txt",true);
		try(fos){
			//byte[]배열에 a-z까지 넣고 배열을 한꺼번에 파일에 쓰기
			byte[] b=new byte[26];
			byte data=65;
			for(int i=0;i<b.length;i++) 
				b[i]=data++;
				
			
			fos.write(b,2,10);//배열 2번째 위치부터 10개 바이트 출력하기
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
