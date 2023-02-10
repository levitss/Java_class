package kr.co.ezenac.generic;

public class GenericPrinterTest {
	public static void main(String[] args) {
		//GenericPrinter<T> 구체적인 자료형은 여기에 입력
		GenericPrinter<Powder> powderP=new GenericPrinter<>();
		powderP.setmaterial(new Powder());//T 타입을 매개로 받는데 위에서 Powder로 타입 잡아줬으니 
//		Powder pow=new Powder();
//		powderP.setmaterial(pow);
		System.out.println(powderP);
		GenericPrinter<Plastic> plasticP=new GenericPrinter<>();
		plasticP.setmaterial(new Plastic());
		System.out.println(plasticP);
		
		GenericPrinter test=new GenericPrinter<>();// 아무것도 지정하지 않으면 Object로 
		
		//GenericPrinter<Metal> metal=new GenericPrinter<>();
		
	
		
	}
	
}
