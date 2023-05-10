package week2.day3;

public class EmployeeDetails {

	public void printEmployeeName(String empName,int empId) {
		System.out.println("Name = "+empName );
		System.out.println("Id= "+empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Address= "+empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("Salary= "+empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("PhoneNumber= "+mobNum);
	}public static void main(String[] args) {
		EmployeeDetails employee=new EmployeeDetails();
		employee.printEmployeeName("Purushoth", 5006);
		employee.getEmployeeAddress("Chennai");
		employee.printEmployeeSalary(35000.56);
		employee.printEmployeeMobileNumber(8270382342L);
	}

}
