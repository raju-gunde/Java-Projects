package june_20;

public class CabCustomer {
	private  int custId;
	private String custName;
	private String pickupLocation;
	private String dropLocation;
	private int distance;
	private String phone;
	public CabCustomer() {
		
	}
	public CabCustomer(int custId, String custName, String pickupLocation, String dropLocation,
			int distance, String phone) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phone = phone;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "CabCustomer [custId=" + custId + ", custName=" + custName + ", pickupLocation=" + pickupLocation
				+ ", dropLocation=" + dropLocation + ", distance=" + distance + ", phone=" + phone + "]";
	}
	
	
}
