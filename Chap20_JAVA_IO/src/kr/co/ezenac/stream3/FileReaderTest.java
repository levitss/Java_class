package kr.co.ezenac.stream3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {
	public static void main(String[] args)  {
		
		try (Reader fr=new FileReader("input2")){//autoclose
			int i;
			
			while ((i=fr.read())!=-1){//마지막 값은 -1 즉 다 읽으면 종료
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
