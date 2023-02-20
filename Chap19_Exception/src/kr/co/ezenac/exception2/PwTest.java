package kr.co.ezenac.exception2;

public class PwTest {
	private String pw;
	
	public void setPw(String pw) throws PwException{//메서드의 예외처리 정의 이리 해두면 메서드 사용시 예외처리 강제됨
		//예외 처리 상세
		if(pw==null) {
			throw new PwException("비밀번호는 null일 수 없다");
		}else if(pw.length()<8) {
			throw new PwException("비밀번호의 길이는 8자 이상");
		}else if(pw.matches("[a-zA-Z]+"))
			throw new PwException("비밀번호는 숫자나 특수문자를 포함해야 한다.");
		this.pw=pw;
		
		
	}

	public static void main(String[] args) {
		PwException pw=new PwException("test");
		PwTest pwt=new PwTest();
		String pass=null;
		
		try {
			pwt.setPw(pass);
			System.out.println("오류없음");
		} catch (PwException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		pass="e";
		try {
			pwt.setPw(pass);
		} catch (PwException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		pass="eeeeeeee";
		try {
			pwt.setPw(pass);
		} catch (PwException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		pass="eeeeeeee!";
		try {
			pwt.setPw(pass);
			System.out.println("dh");
		} catch (PwException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		
		
		System.out.println("end");
		
		
		
	}
}
