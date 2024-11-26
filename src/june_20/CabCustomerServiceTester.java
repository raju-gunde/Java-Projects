package june_20;

public class CabCustomerServiceTester {
	public static void main(String[] args) {
		CabCustomer cust = new CabCustomer(101, "Java", "Hyd", "Chennai", 500, "9876543210");
		CabCustomerService custServ = new CabCustomerService();
		custServ.addCabCustomer(cust);
		System.out.println(custServ.calculateBill(cust));

		CabCustomer cust1 = new CabCustomer(102, "Pavan", "Mumbai", "Delhi", 500, "9876543660");
		custServ.addCabCustomer(cust1);
		System.out.println(custServ.calculateBill(cust1));
		CabCustomer cust2 = new CabCustomer(101, "Raju", "Hyd", "Chennai", 500, "9876543210");
		custServ.addCabCustomer(cust2);
		System.out.println(custServ.calculateBill(cust2));
		CabCustomer cust3 = new CabCustomer(102, "Pavan", "Mumbai", "Delhi", 500, "9876543660");
		custServ.addCabCustomer(cust3);
		System.out.println(custServ.calculateBill(cust3));

	}
}
