package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo1 {
	public static void main(String[] args) {
		Stream<Integer> ss = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Optional<Integer> op = ss.reduce(Integer::sum);
		// using reduce to total sum
		System.out.println(op);
		List<Integer> numbers = Arrays.asList(1, 2, 3);

		Optional<Integer> max = numbers.stream().reduce(Integer::max);
		// using reduce to total max
		max.ifPresent(System.out::println);
		Optional<Integer> product = numbers.stream().reduce((a, b) -> a * b);
		product.ifPresent(System.out::println);
		List<String> words = Arrays.asList("Java", "is", "Best");
		Optional<String> concatenated = words.stream().reduce((a, b) -> a + "" + b);
		System.out.println(concatenated);

	}

}
