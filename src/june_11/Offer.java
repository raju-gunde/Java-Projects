package june_11;

public class Offer {
	String OfferText;

	public Offer(String offerText) {
		super();
		OfferText = offerText;
	}

	public String getOfferText() {
		return OfferText;
	}

	@Override
	public String toString() {
		return "Offer [OfferText=" + OfferText + "]";
	}
	
	

}
