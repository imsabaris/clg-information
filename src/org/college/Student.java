package org.college;

public class Student extends College {
	public void StudentName() {
		System.out.println("mathi");
	}
	public void studentDept() {
		System.out.println("mech");
	}
	public void studentId() {
		System.out.println("12ece123");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.StudentName();
		s.studentDept();
		s.studentId();
		s.hostelName();
		s.deptName();
	}
}
