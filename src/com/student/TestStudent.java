package com.student;

public class TestStudent {
	public static void main(String args[]) {
		Student s1 = new Student("rohan", "AIML", 67, 20);
		System.out.println("The name of the student is : " + s1.name);
		
		RegularStudent rs = new RegularStudent("rohan", "AIML", 67, 20, 67, "H701");
		HostelStudent hs = new HostelStudent("rohan", "AIML", 67, 20, 67, "H701", "arya", 309);
		rs.displayInfo(); // parent class function
		rs.payFee();
		s1.PayFee();
		hs.payFee();
		
	}
}
