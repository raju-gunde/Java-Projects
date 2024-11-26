package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StremFindMethods {
	public static void main(String[] args) {
		List<String> ll = Arrays.asList("king", "rahul", "charan", "ravitheja");
		Optional<String> max = ll.stream().findFirst();

		max.ifPresent(System.out::println);
		 Stream<String> stream = Stream.of("Raj", "Ankit", "Aman", "Rahul", "Ravi");
	        
	        Optional<String> anyElement = stream.filter(s -> s.startsWith("R")&&s.endsWith("i")).findAny();

	        anyElement.ifPresent(System.out::println);
	}

}
