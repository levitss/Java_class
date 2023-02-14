package kr.co.ezenac.set02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		System.out.println(map.size());
		map.put("LEE", 1);
		map.put("JIN", 2);
		map.put("REI", 3);
		map.putIfAbsent("REI", 3);//- Key 값이 존재하는 경우 Map의 Value의 값을 반환하고, Key값이 존재하지 않는 경우 Key와 Value를 Map에 저장하고 Null을 반환합니다.
		map.put("REI", 3);
		System.out.println(map.size());
		System.out.println(map.get("LEE"));
		System.out.println(map.toString());
		System.out.println(map.values());
		System.out.println(map.keySet());

//		Set<Map.Entry<String, Integer>>entrySet=map.entrySet();//tuple 생성 Map에 저장된 데이터 열거
		/*메소드 entrySet은 Map의 데이터를 담고있는 Set을 반환한다. 반환한 Set의 ㄱㅄ이 사용할 데이터의 타입은 Map.Entry
		 * Map.entry는 인터페이스인데 getKey,getValue api를 가지고 있다
		 * 
		 * map을 set으로 변환 후 iterator로 출력
		 */
		Set<Map.Entry<String, Integer>>entrySet=map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		//Iterator는 자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry=entryIterator.next();
			String key=entry.getKey();
			int value=entry.getValue();
			System.out.println(key+" "+value);
		}
		
		
		
	}
}
