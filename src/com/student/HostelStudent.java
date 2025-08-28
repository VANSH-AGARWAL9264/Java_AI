package com.student;

public class HostelStudent extends RegularStudent {
	
	String hostel_name;
	int room_no;
	
	public HostelStudent(String name, String Department, int RollNo, float Age, int attendance_per, String class_room, String hostel_name,
	int room_no) {
		super(name, Department, RollNo, Age, attendance_per, class_room);
		this.hostel_name = hostel_name;
		this.room_no = room_no;
	}
}
