package kr.co.ezenac.decorator;

public class CoffeeTest {
	public static void main(String[] args) {
		Coffee kenyaCoffee=new KenyaEspresso();
		kenyaCoffee.brewing();
		System.out.println();
//		Coffee ethiopiaCoffee=new EthiopiaEspresso();
//		ethiopiaCoffee.brewing();
		Coffee kenyaLatte=new Latte(kenyaCoffee);
		kenyaLatte.brewing();
		
		Coffee kenyamocha=new Mocha(new Latte(kenyaCoffee));
		kenyamocha.brewing();
		
		Coffee kenyamochawithCream=new Cream(new Latte(new EthiopiaEspresso()));
		kenyamochawithCream.brewing();
	}
}
