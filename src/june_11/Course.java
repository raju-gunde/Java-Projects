package june_11;

public class Course {
	int CourseId;
	String CourseName;
	double CourseFee;


	public Course(int courseId, String courseName, double courseFee) {
		super();
		CourseId = courseId;
		CourseName = courseName;
		CourseFee = courseFee;
	}

	public int getCourseId() {
		return CourseId;
	}

	public String getCourseName() {
		return CourseName;
	}

	public double getCourseFee() {
		return CourseFee;
	}

	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", CourseName=" + CourseName + ", CourseFee=" + CourseFee + "]";
	}
	

}
