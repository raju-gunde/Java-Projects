package streamAPI;

import java.util.stream.Stream;

public class StreamDropWile {
	public static void main(String[] args) {
		Stream<Integer> number=Stream.of(1,2,3,4,5,6,7,8,9,10);
		number.dropWhile(n ->n<5).forEach(System.out::println);
	}

}
