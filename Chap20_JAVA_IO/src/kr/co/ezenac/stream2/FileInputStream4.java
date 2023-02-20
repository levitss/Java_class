package kr.co.ezenac.stream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream4 {
	public static void main(String[] args) {
		try(InputStream fis=new FileInputStream("input2")){
			byte[]bs=new byte[10];
			int i;
			while((i=fis.read(bs,0,9))!=-1) {//0부터 9개씩 잘라서 넣어주기
				for(int k=0;k<i;k++)
					System.out.print((char)bs[k]);
				System.out.println(":"+i+"바이트 읽음");
			}
				
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
