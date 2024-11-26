package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethodsDemo {
	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("dhoni", "rohith", "kohli", "king");
		System.out.println(s1.count());
		System.out.println("Arrays List......................");
		List<String> list = Arrays.asList("surya", "kohli", "rohith", "sanju");
		long count = list.stream().filter(s -> s.length() > 3).count();

		System.out.println("String whose length is greater than  3 is : " + count);
		
		long count1=list.stream().filter(s ->s.startsWith("s")).distinct().count();
		
		System.out.println(count1);

	}

}
