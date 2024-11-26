package june_12;

public class DoseBooking {

	private boolean booked;

	public DoseBooking(boolean booked) {
		super();
		this.booked = booked;
	}

	public void bookDose(){

		try {
			if (booked == true) {
				throw new RuntimeException("Dose already booked.");
			}
			

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}
	public void isDoseBooked() {
		
		if(booked==true) {
			System.out.println("user is booked");
			
			booked=false;
		}
		
		else {
			
			System.out.println("useer is not booked");
		}
	}
}
