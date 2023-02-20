package kr.co.ezenac.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEXCeption {
	public Class loadClass(String fileName, String classname) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fs=new FileInputStream(fileName);
		
		Class clazz= Class.forName(classname);
		return clazz;
	}
	public static void main(String[] args) {
		ThrowsEXCeption test=new ThrowsEXCeption();
		try {
			test.loadClass("testt", "java.lang.String");
//		} catch (Exception e) {
			//범위가 넓ㅅ어서 아래것들이 필요없어지니 순서를 맨 마지막에 
			
		
		
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println(" Program end");
	}
	
}
