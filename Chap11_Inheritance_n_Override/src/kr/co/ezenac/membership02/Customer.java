package kr.co.ezenac.membership02;
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
	private String customerGrade="SILVER";
	int bonusPoint;
	int accumulatedPurchase;
//	double discountRatio=0.9; 이건 vip만
	double bonusRatio=0.01;
	

	
//	public Customer() {
////		bonusRatio=0.01;
//		//defaultGrade는 silver
////		customerGrade="SILVER";
//		System.out.println("customer 생성자 호출");
//	}
	public Customer(String name,int id) {
		this.customerId=id;
		this.customerName=name;
		System.out.println("custo 생성자");
//		bonusRatio=0.01;
//		customerGrade="SILVER"; 중복되는 건 멤버변수에서 초기화.

	}
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		accumulatedPurchase+=price;
		System.out.println((int)(price*bonusRatio)+"원이 적립되었습니다");
		return price; 
	}
	public String showInfo() {
		return customerName+"님의 등급은 "+customerGrade+"이며 현재 보너스 포인트는 "+bonusPoint+"입니다.";
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