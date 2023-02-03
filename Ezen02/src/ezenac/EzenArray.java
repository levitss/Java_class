package ezenac;

import java.util.Scanner;

/*
*메서드명 : 해당 기능에 준하는 이름으로 작명하시오. 
 출력, 추가, 특정위치에 추가, 사이즈값 확인, 특정요소 삭제, 모두 삭제, 특정위치요소 읽기 등
*/

public class EzenArray {

	int [] arr;
	Scanner sc= new Scanner(System.in);
	int count=0;
	public int maxArr=10;
//	public static final String STRINGERROR="error";
	public EzenArray (int size) {//최대 사이즈 입력 생성자
		maxArr=size;
		arr=new int [size];
	}
	public void addArr(int input) { //입력기능
		if(count>=maxArr)
			System.out.println("입력 한계에 도달했습니다. maxArr을 수정하세요");
		else {
		arr[count]=input;
		count++;
		}
	}
	public void printAll(){//출력 all 기능
		System.out.print("배열 출력: ");
		for(int i=0;i<count;i++) {
		
		System.out.print(+arr[i]+"  ");
		}
		System.out.println();
	}
	
	public void insertArr(int position, int input) {//중간 삽입 
		if(position>count||position<0) {
			System.out.println("범위 내에서 입력하세요");
		}
		for(int i=count-1;i>=position-1;i--) {
			arr[i+1]=arr[i];
		}
		arr[position-1]=input;
		count++;
		System.out.println(input+"값이"+position+"번째 배열에 삽입되었습니다.");
	}
	public void checkSize() {//사이즈 체크 현재 배열/최대 배열
		System.out.println("현재 할당된 배열"+count+"/최대 배열"+maxArr);
	}
	public void delAll() {//삭제    삭제 여부도 추가
		System.out.println("정말 삭제하시겠습니까? 동의하신다면 y, 취소하신다면 아무키나 입력하세요");
		String input=sc.nextLine();
		if(input.equals("y")) {
			for(int i=0;i<maxArr;i++) {
				arr[i]=0;
			}
			count=0;
			System.out.println("배열이 모두 초기화 되었습니다");
		}else	System.out.println("취소되었습니다");
		}
		
	public void delSelctArr(int position) {//특정 배열 삭제
		if(arr[position-1]==0)
			System.out.println("해당 배열은 비어있습니다");
		else if(position-1>count||position-1<0)
			System.out.println("범위 내에서 입력하세요");
		else {
			for(int i=position-1;i<count;i++) {
				arr[i]=arr[i+1];		
			}	
			System.out.println(position+"번째 배열의 값이 삭제되었습니다.");
			count--;
		}
	}
	public void getArr(int position) {//특정 위치 출력
		if(position>count||position-1<0) {
			System.out.println("범위 내에서 입력하세요");
		}else System.out.println(position+"번째 값: "+arr[position-1]);
		
	
	}

	public void delSelctInt(int input){//특정 요소 삭제  int찾아서 해당위치 부분 삭제 
		
		int i=0;
		while(i<count||i<maxArr) {
			if(arr[i]==input) {
				for(int j=i;j<count;j++) {
					arr[j]=arr[j+1];
				}
				count--;
				}
			i++;
			}
		}
	}

