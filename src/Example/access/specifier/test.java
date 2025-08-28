package Example.access.specifier;

import com.student.*;

public class test extends Student {
	public static void main(String args[]) {
//		Student s1 = new Student("rohan", "AIML", 67, 20);
		test t1 = new test();
		System.out.println("The name of the student is : " + t1.name);
		
	}
}
