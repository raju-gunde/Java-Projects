package streamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPeakDemo {
	public static void main(String[] args) {
		Stream<String> ss=Stream.of("apple","mango","banana","grapse","kivi");
		List<Integer> l1=ss.peek(s ->System.out.println("peakig from original:"+s.toUpperCase())).map(num ->num.length()
				).collect(Collectors.toList());
		System.out.println(l1);
	}

}
