package ezenac;
// 출력, 추가, 특정위치에 추가, 사이즈값 확인, 특정요소 삭제, 모두 삭제, 특정위치요소 읽기 등
public class EzenArrayTest {
	public static void main(String[] args) {
		EzenArray arr=new EzenArray(10);//맥스값 
		arr.printAll();
		arr.addArr(4);
		arr.addArr(3);
		arr.addArr(4);
		arr.addArr(5);
		arr.addArr(6);
		arr.addArr(7);//배열 입력
		arr.printAll();//모두 출력
		arr.insertArr(1, 9);//4번째 위치에 9 입력
		arr.printAll();//모두 출력
		arr.delSelctArr(7);//2번째 배열 삭제
		arr.printAll();//모두 출력
		arr.checkSize();//사이즈 체크
		arr.getArr(4);//4번째 배열 출력
//		arr.delAll();
		arr.printAll();//모두 출력
		arr.delSelctInt(7);
		arr.printAll();
		arr.checkSize();
		arr.delSelctInt(9);
		arr.printAll();
	}
}
