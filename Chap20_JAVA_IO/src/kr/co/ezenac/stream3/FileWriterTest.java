package kr.co.ezenac.stream3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {
	public static void main(String[] args) {
		try(Writer fw= new FileWriter("Writer.txt")){
			fw.write('a');
			char[] cbuf= {'B','C','D','E','F','G'};
			fw.write(cbuf);
			fw.write("스트링 출력");
			fw.write(cbuf,1,2);
			fw.write("65");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
}
