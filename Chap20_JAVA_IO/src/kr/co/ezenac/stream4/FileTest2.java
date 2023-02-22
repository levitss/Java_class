package kr.co.ezenac.stream4;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FileTest2 {
	public static void main(String[] args) throws IOException {
		File directory=new File("c:/Temp1/directory");
		File file1=new File("C:/Temp1/file1.txt");
		File file2=new File("C:/Temp1/file2.txt");
		if(directory.exists()==false) 
			directory.mkdirs();//s붙은건 서브 디렉토리까지 만들어줌
		if(file1.exists()==false) {
			file1.createNewFile();
			System.out.println("파일1 생성");}
		if(file2.exists()!=true) {
			file2.createNewFile();
		System.out.println("파일1 생성");}
		File temp=new File("C:\\workspace_java");
		File[] arr=temp.listFiles();
		System.out.println("   date\t     time\t\tname\t\t\tsize");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file:arr) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			
			if(file.isDirectory()) {
				System.out.print("\t<DIR>"+file.getName());
			}else {
				System.out.print("\t     "+file.getName()+"\t\t\t"+file.length());//바이트
			}
			System.out.println();
		}
			
	}
}
