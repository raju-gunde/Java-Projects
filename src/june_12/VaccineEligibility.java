package june_12;

public class VaccineEligibility {
	private int age;
	private boolean hasHealthCondition;

public VaccineEligibility(int age, boolean hasHealthCondition) {
	super();
	this.age = age;
	this.hasHealthCondition = hasHealthCondition;
}
   public void isEligible()
   {
	   if(age>=18&&age<=60) 
	   {
		   System.out.println("user is aligeble for Vaccine");
	   }
   }
   
  
}
