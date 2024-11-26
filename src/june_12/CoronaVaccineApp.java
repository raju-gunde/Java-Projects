package june_12;

public class CoronaVaccineApp {
	public static void main(String[] args) throws InterruptedException {
		VaccineEligibility v1 = new VaccineEligibility(20, true);
		VaccineEligibility v2 = new VaccineEligibility(34, true);
		
		DoseBooking book1 = new DoseBooking(true);
		DoseBooking book2 = new DoseBooking(true);
		
		
		User user1 = new User("ramesh", v2, book1);
		
		User user2 = new User("raaj", v1, book2);
		
		Runnable r1 = new Runnable() {

			@Override
			public void run() {

				user1.isEligible();
				user1.isDoseBooked();
				user1.bookDose();
			}
		};
		Thread t1=new Thread(r1);
		
		t1.start();
		t1.join();
	
		Runnable r2 = new Runnable() {

			@Override
			public void run() {

				user2.isEligible();
				user2.isDoseBooked();
				user2.bookDose();
			}
		};
		Thread t2=new Thread(r2);
		t2.start();
		Thread t3=new Thread(()->{
			user1.isEligible();
			user1.isDoseBooked();
			user1.bookDose();
			
		});
		t3.start();

	}

}
