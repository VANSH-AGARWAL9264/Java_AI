package com.student;

public class RegularStudent extends Student {
	
	int attendance_per;
	String class_room;
	
	public RegularStudent(String name, String Department, int RollNo, float Age, int attendance_per, String class_room){
		   super(name, Department, RollNo, Age);
		   this.attendance_per = attendance_per;
		   this.class_room = class_room;
	}
	
//	public RegularStudent() {
//	}
	
	public void payFee(){
		System.out.println("The Student "+ name + "Paid the tution fee + Library fee + Lab fee");
	}
}
