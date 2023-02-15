package kr.co.ezenac.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {
	public static void main(String[] args) {
		List<String> slist=new ArrayList<>();
		slist.add("Arrrrr");
		slist.add("Lee");
		slist.add("Na");
		
		slist.add("12345678");
		slist.stream().forEach(s->System.out.print(s+"\t"));
		Stream<String> stream = slist.stream();
//		stream.forEach(s->System.out.print(s+"\t"));
		
//		stream.forEach(s->System.out.println(s+"\t"));
//		slist.stream().sorted().forEach(s->System.out.print(s+"\t"));
		System.out.println();
		//문자 길이 출력하시오.
		//map()
		Stream<String> st=slist.stream();
		slist.stream().map(s->s.length()).forEach(s->System.out.print(s+"\t"));
//		st.map(s->s.length()).forEach(s->System.out.println(s));
		//문자열이 7보다 큰 것만 출력 filter()
		System.out.println();
		slist.stream().filter(s->s.length()>=7).forEach(s->System.out.println(s));
		
		
	}
}
