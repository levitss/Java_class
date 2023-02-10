package kr.co.ezenac.object;

class MyDate {
	/*
	 * 날짜 구현 클래스
	 * 날짜가 같으면 equals() override 해서 true가 되게
	 */
	
	int day;
	int month;
	int year;
	public MyDate(
			int day,
			int month,
			int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate date=(MyDate)obj;
			if(this.day==date.day&&this.month==date.month&&this.year==date.year) {
				return true;
			}return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
public class MyDateTest{	
	public static void main(String[] args) {
		MyDate m1=new MyDate(10, 2, 23);
		MyDate m2=new MyDate(10, 2, 23);
		System.out.println(m1.equals(m2));
		System.out.println(System.identityHashCode(m1));
		System.out.println(System.identityHashCode(m2));
	}
	
}
