package kr.co.ezenac.encapsulation;

public class DisplayAddress {
	//string buffer 는 mutable한 String
	StringBuffer buffer=new StringBuffer();
	private String line="=======================================\n";
	private String title=" 이름\t	주소\t\t전화번호\n";//tab만큼 뛰어주기
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);		
	}
	
	private void makebody() {
		buffer.append("Lee\t");
		buffer.append("seoul gangnam\t");
		buffer.append("010-0101-1010\n");
		
		buffer.append("Su\t");
		buffer.append("seoul songpa\t");
		buffer.append("010-1010-1010\n");
	}
	private void makeFooter() {
		buffer.append(line);
	}
	public String getAddress() {
		makeHeader();//?buffer.append(line) 등등 호출?
		makebody();
		makeFooter();
		
		return buffer.toString();
	}
	
	
	
	
	
}
