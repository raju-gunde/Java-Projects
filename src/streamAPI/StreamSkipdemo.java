package streamAPI;

import java.util.stream.Stream;

public class StreamSkipdemo {
	public static void main(String[] args) {
		Stream<String> s1=Stream.of("viarat","rohith","kohli","dhoni","bhuvi","davan","surya","sanju");
		s1.skip(3).limit(2).forEach(System.out::println);
	}

}
