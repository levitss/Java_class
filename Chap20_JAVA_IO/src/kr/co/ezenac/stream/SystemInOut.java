package kr.co.ezenac.stream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class SystemInOut {
	public static void main(String[] args) {
		System.out.println("입력을 하고 '끝'을 입력하시오");
		int in=0;
//		while(in!=13) {
		try {
			Reader isr=new InputStreamReader(System.in);
			//inputstreamreader 입력은 바이트 단위지만 2바이트 이상 문자로 변경시켜줌
			
			
			
			
			
			
			while((in=isr.read())!='끝') {//한바이트씩 read()라서 한글은 깨짐
				//->보조스트림
			
			


//			int in1=System.in.read();
//
//			int in2=System.in.read();
			//한 바이트씩 읽기			
//			System.out.println(in);
//			System.out.println(in1);
//			System.out.println(in2);

			System.out.print((char)in);
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
}
