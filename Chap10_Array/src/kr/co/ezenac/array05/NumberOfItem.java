package kr.co.ezenac.array05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//배열.length=아이템 개수
//문자열.indexOf(String key):해당 문자열에 있으면 위치를 리턴. 없으면 -1
//dataset 배열에서 문자 I를 가지고 있는 아이템 수를 출력하시오.

public class NumberOfItem {
	public static void main(String[] args) {
		String [] dataset= {
				"When you're weary"
				, "Feeling small"
				, "When tears are in your eyes"
				, "I'll dry them all"
				, "I'm on your side"
				, "Oh, when times get rough"
				, "And friends just can't be found"
				, "Like a bridge over troubled water"
				, "I will lay me down"
				, "Like a bridge over troubled water"
				, "I will lay me down"
				, "When you're down and out"
				, "When you're on the street"
				, "When evening falls so hard"
				, "I will comfort you"
				, "I'll take your part"
				, "Oh, when darkness comes"
				, "And pain is all around"
				, "Like a bridge over troubled water"
				, "I will lay me down"
				, "Like a bridge over troubled water"
				, "I will lay me down"
				, "Sail on silver girl"
				, "Sail on by"
				, "Your time has come to shine"
				, "All your dreams are on their way"
				, "See how they shine"
				, "Oh, if you need a friend"
				, "I'm sailing right behind"
				, "Like a bridge over troubled water"
				, "I will ease your mind"
				, "Like a bridge over troubled water"
				, "I will ease your mind"
		
		};
		System.out.println(Arrays.asList(dataset).contains("I will ease your mind")); //포함되는가 true/false
		//특정 문자의 개수
		System.out.println(dataset[3].indexOf("I"));
		
		
		int sum=0;
		int q=0;
		for (int i=0;i<dataset.length;i++) {
			if(dataset[i].indexOf("I")>=0)
				q++;
		}
		System.out.println(q);
		
		
//		List<String> list = new ArrayList<String>();
//
//		list.add("apple");
//		list.add("banana");
//		list.add("melon");
//		list.indexOf("apple");
//
//		System.out.println(list.indexOf("melon"));

	}
}
