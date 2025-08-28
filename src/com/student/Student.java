package com.student;

public class Student {
	protected String name;
	String Department;
	int RollNo;
	float Age;
	static String Collegename =  "KIET";
	
	public Student(String name, String Department, int RollNo, float Age) {
		this.name = name;
		this.Department = Department;
		this.RollNo = RollNo;
		this.Age = Age;
	}
	
	public Student() {
		this.name = null;
		this.Department = null;
		this.RollNo = 0;
		this.Age = 0;
	}
//	
//	public void studying (int No_of_hours) {
//		System.out.println("The student" + name + "is studying for" + No_of_hours);
//	}
	
	public void readAndwrite() {
		System.out.println("The student can read and write");
	}
	
	public void displayInfo() {
		System.out.println("Student name is " + name + ", \nAge is " + Age + ", \nRollNo is " + RollNo + "\nand Department is " + Department);
	}
	
	public void HostelStudent(String name, String Department, int RollNo, float Age, int attendance_per, String class_room, String hostel_name,
			int room_no) {
				
			}
	
	public void PayFee() {
		System.out.println("The Student "+ name + "Paid the tution fee");
	}
	
	public void search(int RollNo) {
		System.out.println("Searching by rollno.");
	}
	
	public void search(String name, String Department){
		System.out.println("Searching by name and department.");
	}
	
	public void search(int RollNo, String name) {
		System.out.println("Searching by rollno. and name.");
	}
	
	public void search(String name, int RollNo) {
		System.out.println("Searching by name and rollno.");
	}
	
	public static void main (String args[]) {
//		Using parameterized constructor
		Student student1 = new Student();
		Student student2 = new Student("Rohan", "AI", 1, 19);
//		student1.name = "vansh";
//		student1.Department = "tech";
//		student1.RollNo = 45;
//		student1.Age = 24;
		student1.displayInfo();
		student2.displayInfo();
		System.out.println("collegeName is " + student1.Collegename);
		Student.Collegename = "ABES";
		student1.Collegename = "AKG";
		System.out.println("collegeName is " + student2.Collegename);
//		student1.Department = "AIML";
		
		student1.search(20);
		student1.search("vansh", "cseai");
		student1.search(30, "vansh");
		student1.search("vansh", 40);
	}
}
