package kr.co.ezenac.stream4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
	public static void main(String[] args) {
		long milliseceond=0;
		int i;
		try(FileInputStream fis=new FileInputStream("postgresql-42.5.4.jar");
			FileOutputStream fos=new FileOutputStream("postgresql.jar");
			BufferedInputStream bis=new BufferedInputStream(fis);
			BufferedOutputStream bos=new BufferedOutputStream(fos);	
				){//바이트 단위 스트림들
			milliseceond=System.currentTimeMillis();
			while((i=bis.read())!=-1) {
				bos.write(i);
			}
			milliseceond=System.currentTimeMillis()-milliseceond;
			

			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일복사 시간"+milliseceond);
	}
}
