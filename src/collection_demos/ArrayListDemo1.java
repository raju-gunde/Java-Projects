package collection_demos;

import java.util.ArrayList;

record Custumer(int custemorId,String custemorName,double amount) {
	
}

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<Custumer> cust=new ArrayList<>();
	cust.add(new Custumer(111, "A", 100));
	cust.add(new Custumer(112, "B", 200));
	cust.add(new Custumer(113, "C", 300));
	System.out.println(cust);
	}

}
