package kr.co.ezenac.global02;

public class Employee {
	public static int serialNum=1000;//pmkey
	private int employeeId;	//사원번호
	private String employeeName;
	private String department;
	public Employee() {
		Employee.serialNum++;
		employeeId=serialNum;
	}
	public static void setSerialNum(int serialNum) {
		//static method에선 static var만 사용
		Employee.serialNum=serialNum;
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
		
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
