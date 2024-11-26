package june_20;

import java.beans.Customizer;
import java.util.ArrayList;

public class CabCustomerService {
	private ArrayList<CabCustomer> cust = new ArrayList<CabCustomer>();
	int count=0;

	public void addCabCustomer(CabCustomer c) {
		if (cust.size() == 0 || isFirstCustomer( c)) {
			cust.add(c);
			
		} else {
			System.out.println("Phone number is already exists");
		
			count++;
		}

	}

	private boolean isFirstCustomer(CabCustomer c) {

		if (cust.size() > 0) {
			for (int i = 0; i < cust.size(); i++) {
				if (cust.get(i).getPhone().equals(c.getPhone())) {
					return false;
				} else {
					return true;
				}
			}
		}
		return true;

	}

	public double  calculateBill(CabCustomer c) {
		
		if(count==0) {
			return 0;
		}
		else if(c.getDistance()<=4) {
			return 80;
		}
		else {
			return 80+6*c.getDistance();
		}
	}

}
