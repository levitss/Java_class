package kr.co.ezenac.member02;

public class Time_Test {
	public static void main(String[] args) {
		Time time=new Time();
		time.setHour(23);
		
		time.setMinute(2);
		time.setSecond(6);
//		System.out.println("셋팅된 시간은"+time.getHour()+"시"+time.getMinute()+"분"+time.getSecond()+"초");
		System.out.println(time.toString());//time은 직접 만든 객체. 하지만 toString은 재정의한게 아닌 Object의 toString
		System.out.println(time);//toString이 호출되어 return값이 적용됨
	}
}
