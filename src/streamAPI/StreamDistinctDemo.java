package streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamDistinctDemo {
	public static void main(String[] args) {
		List<String> l1=Arrays.asList("rohith","surya","gil","rohith","surya");
	   l1.stream().distinct().forEach(System.out::println);
	}

}
