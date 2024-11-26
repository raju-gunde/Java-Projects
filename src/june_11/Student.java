package june_11;

import java.util.Scanner;

public class Student {

	String StudentName;
	EducationInstitute institute;

	public Student(String studentName, EducationInstitute institute) {
		super();
		StudentName = studentName;
		this.institute = institute;
	}

	public void viewCoursesAndFees() {
		Course Courses[]=institute.getCourses();
		for(Course cr:Courses) {
			System.out.println(cr);
			
		}
		
		
	}

	public void viewOffers() {
		Offer offers[]=institute.getOffers();
		for(Offer of:offers) {
			System.out.println(of);
			
		}

	}
	public void enrollInCourse(int courseId) {
	institute.enrollStudentInCourse(courseId, StudentName);

		
 	}
/*	@Override
	public void run() {
		viewCoursesAndFees();
		viewOffers();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		
		
		enrollInCourse(id);
		
		
		
		
		
	}
	*/

}
