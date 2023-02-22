package kr.co.ezenac.stream4;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file=new File("C:\\workspace_java\\Chap20_JAVA_IO\\postgresql-42.5.4.jar");
		System.out.println(file.canRead());
		System.out.println(file.getAbsolutePath());
		file.delete();
		
	}
}
