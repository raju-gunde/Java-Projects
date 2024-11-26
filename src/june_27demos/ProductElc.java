package june_27demos;

import java.util.ArrayList;
import java.util.Collections;

public class ProductElc {
	public static void main(String[] args) {
		ArrayList<Product> pro=new ArrayList<Product>();
		pro.add(new Product(111, "Java-650", 60000.0));
		pro.add(new Product(112, "Parlage", 2000.0));
		pro.add(new Product(4324, "RoyalEnfield-650", 248470.0));
		Collections.sort(pro);
		pro.forEach(System.out::println);
	}

}
