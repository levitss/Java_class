package kr.co.ezenac.nongeneric;

public class ThreeDPrinterTest {
	public static void main(String[] args)  { 
		ThereeDPrinter1 print1=new ThereeDPrinter1();
		Powder powder=new Powder();
		print1.setMaterial(powder);
		Powder powder2=print1.getMaterial();
		System.out.println(print1.getMaterial());
		System.out.println(powder2);
		
		ThreeDPrinter2 printer2=new ThreeDPrinter2();
		Plastic plastic=new Plastic();
		printer2.setMaterial(plastic);
		Plastic s=printer2.getMaterial();
		System.out.println(s);
		ThreeDPrinter3 p3=new ThreeDPrinter3();
		p3.setMaterial(powder);
		Powder powder3=(Powder) p3.getMaterial();//Object타입이라 캐스팅이 필요함
		System.out.println(p3.getMaterial());
		System.out.println(powder3);
		
		p3.setMaterial(plastic);
		Plastic plastic3=(Plastic) p3.getMaterial();
		System.out.println(plastic3);
		
		
		
		
		//재료를 플라스틱 파우더 바꿀때마다 번거롭다.
		//매개변수의 타입을 최상위 클래스인 Object로 세팅하면 되지만 매번 캐스팅을 해줘야함
		
		//c++의템플릿=java의 제너릭
		
	}
}
