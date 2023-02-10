package classz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RefectTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class classzz =Class.forName("java.lang.String");//string 클래스 불러옴
		
		Constructor<String>[] cons= classzz.getConstructors();
		for(Constructor con:cons) {
			System.out.println(cons);
		}
		//스트링이 가지고 있는 생성자들
		
		System.out.println();
		
		Method[] methods= classzz.getMethods();
		for(Method met:methods){
			System.out.println(methods);
		}
		
		//스트링이 가지고 있는 메서드들
		
	}
}
