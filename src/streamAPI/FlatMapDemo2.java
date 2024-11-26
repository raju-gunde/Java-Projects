package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo2 {
	public static void main(String[] args) {
		List<String> l1=Arrays.asList("dhoni","kohli","rohith","shikar","bhuvi");
		l1.stream().flatMap(p -> Stream.of(p.charAt(0))).forEach(ch ->System.err.println(ch));
	}

}
