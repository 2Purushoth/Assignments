package org.college;

public class Department extends College {
	public void departmentName () {
		System.out.println("The Department is CSE ");
	}
	
	public static void main(String[] args) {
		Department dept = new Department () ;
		dept.collegeCode();
		dept.collegeName();
		dept.collegeRank();
		dept.departmentName();
	}

}
