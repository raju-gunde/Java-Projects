package june_28;

import java.util.Comparator;
import java.util.TreeSet;

public class Productelc {
	public static void main(String[] args) {
		Comparator<Product> cp=new Comparator<Product>() {
			
			@Override
			public int compare(Product o1, Product o2) {
			
				return o2.id()-o1.id();
			}
		};
		TreeSet<Product> tp=new TreeSet<Product>(cp);
		tp.add(new Product(102, "hdjfh"));
		tp.add(new Product(107, "jdhfuj"));
		tp.add(new Product(192, "fhoaf"));
		tp.add(new Product(279, "ghfga"));
		tp.forEach(System.out::println);
	}

}
