package kr.co.ezenac.membership;
/*
 * 		일반고객	 vip고객
 * 할인율 적립율차이
 * 상속 활용하여 구현하기
 * 일반고객 
 * 고객id, name, grade, bonus point, bonusPointRatio(1%) 
 */
public class Customer {
	private int customerId;
	private String customerName;
	private String customerGrade;
	int bunusPoint;
//	double discountRatio=0.9; 이건 vip만
	double bonusRatio;
	
	public Customer() {
		
		bonusRatio=0.01;
		//defaultGrade는 silver
		customerGrade="SILVER";
		System.out.println("customer 생성자 호출");
	}
	public Customer(int id, String name) {
		this.customerId=id;
		this.customerName=name;
	}
	
	
	
	
	
	
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}



//다음주 수요일까지 스토리보드 생각하기