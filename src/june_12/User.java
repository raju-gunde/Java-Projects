package june_12;

public class User {
	private String name;
	private VaccineEligibility eligibility;
	private DoseBooking booking;

	public User(String name, VaccineEligibility eligibility, DoseBooking booking) {
		super();
		this.name = name;
		this.eligibility = eligibility;
		this.booking = booking;
	}

	public void isEligible() {
		eligibility.isEligible();
	}
	public void bookDose() {
		booking.bookDose();
	}
	public void isDoseBooked() {
		booking.isDoseBooked();
	}

}
