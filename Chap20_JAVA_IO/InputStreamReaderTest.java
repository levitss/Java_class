package kr.co.ezenac.stream4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		int c;
		try(Reader isr=new InputStreamReader(new FileInputStream("input2"))){
			while ((c=isr.read())!=-1) {
				System.out.print((char)c);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
}
