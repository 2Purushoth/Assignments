package org.Bankinfo;

public class StudentInfo {
	
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id , String name) {
		System.out.println(id + " , " + name);
	}
	public void getStudentInfo(String emailId , long phoneNumber) {
		System.out.println(emailId + " , " + phoneNumber  );
	}

	public static void main(String[] args) {

		StudentInfo student = new StudentInfo();
		student.getStudentInfo(1234576523);
		student.getStudentInfo(1234576523, "Vicky");
		student.getStudentInfo("emailid.@gmail.com", 1234567892);
	}

}


