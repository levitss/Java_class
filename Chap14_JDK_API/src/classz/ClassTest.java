package classz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Person p=new Person("lee");//로컬 호출
		System.out.println(p);//tostring
		
		
		
		//리플렉션으로 원격 호출
		
		Class classz=Class.forName("classz.Person");//클래스의 이름을 인자로 클래스 정보를 가져옴
		System.out.println(classz.getName());
		Person p2=(Person) classz.newInstance();
		System.out.println(p2);
		
		Class[] parameterType= {String.class};//??
		Constructor cons= classz.getConstructor(parameterType);//생성자 중 스트링타입을 파라미터로 받는 걸 사용하고자 함
		//getConstructor는 public만 가져오고 Declared는 private public 등 모든 생성자를 가져옴
		Constructor cons2=classz.getDeclaredConstructor(parameterType);
		Constructor cons3=classz.getDeclaredConstructor(String.class);
		Constructor cons4=classz.getDeclaredConstructor();
		
		Method[] met= classz.getDeclaredMethods();//super거는 안가져옴
		//getMethod는 public. 상속받은 것도 다 가져옴
		Field[] field=classz.getDeclaredFields();
		
		Object[] reflectargs= {"Shin"};
		Person p3=(Person) cons.newInstance(reflectargs);
		System.out.println(p3);
		
		
		
		
		Method method=classz.getDeclaredMethod("test1", int.class);
		int returnValue=(int) method.invoke(method, 222);
		System.out.println(returnValue);
		
		
		
		//보통 프레임워크에서 처리해줌
	}
}
