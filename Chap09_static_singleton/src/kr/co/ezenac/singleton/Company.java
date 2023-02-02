package kr.co.ezenac.singleton;

public class Company {
	
	private Company() {}
	private static Company instance = new Company();//관용적으로 instance 명 사용.
	public static Company getInstance() {
		if(instance==null)//예외 방지 null check
			instance =new Company();
		return instance;
	}
	
	
	

}
