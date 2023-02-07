
package kr.co.ezenac.membership02;

public class Vip extends Customer {
	double discountRatio;
	private int agentId;
	public Vip(String name,int id) {
//		if(accumulatedPurchase>1000000) {
			super(name,id);
			setCustomerGrade("VIP");
			bonusRatio=0.05;
			discountRatio=0.9;
			agentId=2222;
			System.out.println("vip 생성자");
//			setCustomerId(id);
//			setCustomerName(name);
			
//		}
//		else System.out.println("조건 미충족");
	}		
			
			///승계 작업하려면 그냥 한 클래스 안에서 작업하는게 옳은듯
	
	
//	public int clacPrice(int price){
//		int result=(int)(price*discountRatio);
//		bonusPoint+=(int) (price*bonusRatio);
//		return result;
//	}
	
	public void setAgentId(int agentId) {
			this.agentId = agentId;
	}
	public int getAgentId() {
		return agentId;
	}
	@Override
	public int calcPrice(int price) {
		int result=(int)(price*discountRatio);
		bonusPoint+=(int) (price*bonusRatio);
		return result;
	}
	
}
