package june_27demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomerElc {
	public static void main(String[] args) {
		ArrayList<Customer> cus=new ArrayList<Customer>();
		cus.add(new Customer(19, "C", 2787.0));
		cus.add(new Customer(12, "A", 2187.0));
		cus.add(new Customer(19, "rufu", 2087.0));
		cus.add(new Customer(7, "rufu", 8383.828));
//		Comparator<Customer> id=new Comparator<Customer>() {
//			
//			@Override
//			public int compare(Customer o1, Customer o2) {
//				
//				return o1.getCostomerNumber()-o2.getCostomerNumber();
//			}
//		};
		//Collections.sort(cus,id);
		//cus.forEach(System.out::println);
		System.out.println("------------------------------------------------");
		Comparator<Customer> name=new Comparator<Customer>() {
			
			@Override
			public int compare(Customer o1, Customer o2) {
				int name = o1.getCustomerName().compareTo(o2.getCustomerName());
				if(name==0) {
					return o1.getCostomerNumber()-o2.getCostomerNumber();
					
					
				}
				else
					return name;
			}
		};
		
		Collections.sort(cus,name);
		cus.forEach(System.out::println);
//		System.out.println("---------------------------------------------------");
//		Comparator<Customer> price=(t1,t2)->(int)(t1.getCustomerPrice()-t2.getCustomerPrice());
//		Collections.sort(cus,price);
//		cus.forEach(System.out::println);
		
		
		
	}

}
