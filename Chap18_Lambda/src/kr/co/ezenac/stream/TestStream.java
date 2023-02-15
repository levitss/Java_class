package kr.co.ezenac.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String[] args) {
		
		//of로 스트링들을 스트림화
		Stream<String> strS= Stream.of("뉴질랜드 사이클론","국가 비상사태 선포","뉴질랜드 역사상 세 번째");
		List<String> list= strS.collect(Collectors.toList());
		System.out.println(list);
//		String [] cityarr=new String[] {"서울","뉴욕","시드니"};
		
		//String 배열을 따로 선언 후 stream화 
		String [] cityarr={"서울","뉴욕","시드니"};
		Stream<String> cityS=Arrays.stream(cityarr);
		List<String> citylist=cityS.collect(Collectors.toList());
		//collect()는 Stream의 데이터를 변형 등의 처리를 하고 원하는 자료형으로 변환해 줍니다.
/*Stream의 아이템들을 List 또는 Set 자료형으로 변환
Stream의 아이템들을 Sorting하여 가장 큰 객체 리턴
Stream의 아이템들의 평균 값을 리턴
등등
 * 
 * 
 * 
 */

		System.out.println(list);
		
		
		
	}
}
