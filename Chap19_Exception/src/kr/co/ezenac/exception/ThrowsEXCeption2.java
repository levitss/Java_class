package kr.co.ezenac.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEXCeption2 {
	public Class loadClass(String fileName, String classname) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fs=new FileInputStream(fileName);
		
		Class clazz= Class.forName(classname);
		return clazz;
	}
	public static void main(String[] args) {
		ThrowsEXCeption test=new ThrowsEXCeption();

			try {
				test.loadClass("ezen19", "java.lang.String");
			} catch (FileNotFoundException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		System.out.println(" Program end");
	}
	
}
