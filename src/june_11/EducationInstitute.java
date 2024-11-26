package june_11;

public class EducationInstitute {

	Course Courses[];
	Offer offers[];

	public EducationInstitute(Course[] courses, Offer[] offers) {
		super();
		Courses = courses;
		this.offers = offers;
	}

	public Course[] getCourses() {
		return Courses;
	}

	public Offer[] getOffers() {
		return offers;
	}

	public void enrollStudentInCourse(int CourseId, String StudentName) {
		
		for(int i=0;i<Courses.length;i++)
		{
			if(Courses[i]!=null&&CourseId==Courses[i].CourseId)
			{
          System.out.println(StudentName+" has enrolled in the course: "+Courses[i].getCourseName());
          return;
			}
			
		
		}
		 {
			System.out.println("course is nor available ");
		}
	
		
	}
}
