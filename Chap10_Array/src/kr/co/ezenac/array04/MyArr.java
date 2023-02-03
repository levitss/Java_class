package kr.co.ezenac.array04;

public class MyArr {
	/*
	 * array특징
	 * 동일한 타입만 순서에따라 관리하는 자료구조.
	 * 크기가 정해져있다.(fixed)
	 * 
	 * 요소의 추가와 제거시 다른 요소들의 이동이 필요함
	 * 배열의 n번째 요소를 찾는 인덱스 연산이 빠름
	 * 
	 */
	int intArr[];
	int count;//length 대신 쓸 실제 데이터 수 카운트.
	public int ARRAY_SIZE;
	public static final int ERROR_NUM=-999999999;
	
	public MyArr() {
		count=0;
		ARRAY_SIZE=10;
		intArr=new int [ARRAY_SIZE];//default로 최대 arr 사이즈를 세팅
		
	}//기본생성자
	public MyArr(int size) {
		count=0;
		ARRAY_SIZE=size;
		intArr=new int [ARRAY_SIZE];//최대 arr값 입력
	}
	public void printAll() {
	
		if(count==0) {
			System.out.println("출력할 내용이 없습니다");//입력된 값 없을 때
		return;//else 안쓰고 리턴시킴
	}
	
		for(int a=0;a<count;a++) {
			System.out.print(intArr[a]+" ");
		}
		System.out.println();
	}
	public void addElement(int a) {
		if(count>=ARRAY_SIZE)//배열이 가득할때
		{
			System.out.println("배열 범위를 넘었음");
			return;
		}
		intArr[count++]=a;//마지막에 ++
	}
	public void insertElement(int position, int num) {
		if(count>=ARRAY_SIZE) {
			System.out.println("메모리가 가득참");
			return;
		}
		if (position<0||position>ARRAY_SIZE) {
			System.out.println("index error");
			return;
		}
//		if(intArr[position]==0) {//0<n일 경우에만
//			intArr[position]=num;
//			return;//
//		}
		for(int i=count-1;i>=position;i--) {//뒤에서 앞으로 01234 5개 배열 포지션 2이면 4부터 시작해서 432를 543으로 넘기는 작업
			//split해도 될 것 같음
			intArr[i+1]=intArr[i];//하나씩 뒤로 넘겨주기
		}
		intArr[position]=num;
		count++;
		//현재 배열 크기를 유지한 채로 추가 하는 것.

//		int []copy=new int[ARRAY_SIZE+1];
//		System.arraycopy(copy, num, copy, position, num);			
//			count-position 까진 추가
//			position 추가
//			이후는 count+1
	}
	public void getSize() {
		System.out.printf("%d/%d\n",count,ARRAY_SIZE);
	}
	public void removeAll() {
		for(int i=0;i<ARRAY_SIZE;i++) {
			intArr[i]=0;
			count=0;
		}
	}
	public int removeElement(int position) {
		int result=ERROR_NUM;
//		if(position<0||position>count) { 
//			System.out.println("index error");	
//		}
//		
//		if(position>=count) {
//			System.out.println("range error");
//		}
		if(isEmpty()) {
			System.out.println("값이 비어있음");
			return result;
		}
			
		else if (position<0||position>count) {
			System.out.println("삭제하는 도중 에러 발생");
		}
		else {
			
			for (int i=position-1;i<count-1;i++) {
				intArr[i]=intArr[i+1];
//				intArr[count]=0;
			}
			count--;
			result=intArr[position];
		}
		
		
			
		return result;
	}
	public boolean isEmpty() {
		if (count==0) return true;
		else return false;
	}
	
	public int getEelement(int position) {
		int result = ERROR_NUM;
		if(position<=0||position>count) {
			System.out.println("index error");
		}
		else {
			result=intArr[position-1];//보통 1부터 세는것과 0부터 세는 것 차이..
		}
		
		
		
		return result;
	}

	
}
