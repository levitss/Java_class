package kr.co.ezenac.membership;

public class Vip extends Customer {
	double discountRatio;
	private int agentId;
	public Vip(String name,int id) {
//		if(accumulatedPurchase>1000000) {
			super("leeeee",202020);
			setCustomerGrade("VIP");
			bonusRatio=0.05;
			discountRatio=0.9;
			setCustomerId(id);
			setCustomerName(name);
			
//		}
//		else System.out.println("조건 미충족");
			
			
			///승계 작업하려면 그냥 한 클래스 안에서 작업하는게 옳은듯
	}
	public double clacPrice(int price){
		double result=price*discountRatio;
		bonusPoint+=(int) (price*bonusRatio);
		return result;
	}
	
	public void setAgentId(int agentId) {
			this.agentId = agentId;
	}
	public int getAgentId() {
		return agentId;
	}
	
	
}
