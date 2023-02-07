package membership;

import java.util.ArrayList;

public class CustomerTest2 {
	public static void main(String[] args) {
		Customer cm1=new Customer("lee", 1212);
		Customer cm2=new Customer("Sue", 12112322);
		Customer gold1=new Gold("Kim", 231233);
		Customer gold2=new Gold("Woo", 23567);
		Customer vip1=new Vip("Shin", 11111);
		Customer vip2=new Vip("Choi", 22222);
		cm1.bonusPoint=2222;
		
		
		
		
		
		//자식것에서 override하면 부모 메서드에 영향줌
		//다형성
		
		gold1.calcPrice(500000);
		System.out.println(gold1.showInfo());
		ArrayList<Customer> customerList=new ArrayList<>();
		customerList.add(cm2);
		customerList.add(gold1);
		customerList.add(vip1);
		customerList.add(vip2);
		customerList.add(gold2);
		customerList.add(cm1);
		for(Customer customer:customerList) {
			System.out.println(customer.showInfo());
		}
		
		int price=10000;
		for(Customer cus:customerList) {
			System.out.println(cus.getCustomerName());
			cus.calcPrice(price);
		}
		
		
	}
}
