package june_11;

public class EducationInstituteApp {

	public static void main(String[] args) throws InterruptedException {
		Course c1 = new Course(1, "mathematics", 1000);
		Course c2 = new Course(2, "sciense", 1200);
		Course c3 = new Course(3, "english", 900);
		Offer o1 = new Offer("Get 20% off on all courses!");
		Offer o2 = new Offer("Enroll in any two courses and get one course free!");
		Course cr[] = { c1, c2, c3 };
		Offer of[] = { o1, o2 };

		EducationInstitute e1 = new EducationInstitute(cr, of);

		Student st1 = new Student("virat", e1);
		//st1.institute.getCourses();
		
		Student st2 = new Student("dhoni", e1);
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				st1.viewCoursesAndFees();
				st1.viewOffers();
				st1.enrollInCourse(1);
				
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		
		
		
	
	Thread t=new Thread(()->
	{
	st2.viewCoursesAndFees();
	st2.viewOffers();
	st2.enrollInCourse(2);
	}
	);
	
	t1.join();
	t.start();
}
}
