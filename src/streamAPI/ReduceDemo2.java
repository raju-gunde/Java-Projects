package streamAPI;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceDemo2 {
	record Sale(String item, Double amount) {

	}

	public static void main(String[] args) {
		Stream<Sale> sales = Stream.of(new Sale("Camera", 10000.0), new Sale("Mobile", 50000.0),
				new Sale("Laptop", 80000.0));
		Double totalsale = sales.reduce(0.0, (sum, sale) -> sum + sale.amount(), Double::sum);
		System.out.println(totalsale);
		
	}
}
