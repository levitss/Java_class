
package membership;

public class Vip extends Customer {
	double discountRatio;
	private int agentId;
	public Vip(String name,int id) {
			super(name,id);
			setCustomerGrade("VIP");
			bonusRatio=0.05;
			discountRatio=0.1;
			agentId=2222;
			System.out.println("vip 생성자");
	}
	public Vip(String name,int id, int agentId) {
		super(name,id);
		setCustomerGrade("VIP");
		bonusRatio=0.05;
		discountRatio=0.1;
		agentId=agentId;
		System.out.println("vip 생성자");
	}
	
	
//승계 작업하려면 그냥 한 클래스 안에서 작업하는게 옳은듯
	
	
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
	public void calcPrice(int price) {
		int result=(int)Math.round((price*(1-discountRatio)));
		int point=(int) Math.round((price*bonusRatio));
		bonusPoint+=point;
		System.out.println(price+"를 "+discountRatio*100+"% 할인받아 "+result+"원에 구매");
		System.out.println(point+"원 적립. 적용비율"+bonusRatio);
//		return result;
	}
	@Override
	public String showInfo() {
		return super.showInfo()+"담당 상담원 번호는 "+agentId;		
	}
	
}
