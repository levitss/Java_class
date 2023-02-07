package membership;

public class Gold extends Customer {
	
		public Gold(String name,int id) {
		super(name,id);
		setCustomerGrade("GOLD");
		discountRatio=0.1;
		bonusRatio=0.02;
	}
		@Override
		public void calcPrice(int price) {
			
			int result=(int)Math.round((price*(1-discountRatio)));
			int point=(int) Math.round((price*bonusRatio));
			bonusPoint+=point;
			System.out.println(price+"를 "+discountRatio*100+"% 할인받아 "+result+"원에 구매");
			System.out.println(point+"원 적립. 적용비율"+bonusRatio);
//			return result;
		}

}
