package kr.co.ezenac.global02;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmployeeName("Lee");
		//System.out.println(Employee.serialNum);//emp.serialNum 보단 class명을 붙여서 불러오는게 정상임.
		Employee emp2=new Employee();
		emp2.setEmployeeName("Jin");
		System.out.println(emp.getEmployeeName()+","+emp.getEmployeeId());
		System.out.println(emp2.getEmployeeName()+","+emp2.getEmployeeId());
		System.out.println(Employee.serialNum);
	}

}
