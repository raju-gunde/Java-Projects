package streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamSortedDemo {
	public static void main(String[] args) {
		System.out.println("default sorting order...");
		List<Integer> l1=Arrays.asList(1,5,2,6,3);
		l1.stream().sorted().forEach(System.out::println);
		//using user sorting order...
		System.out.println("using user sorting order...");
		l1.stream().sorted((i1,i2)->i2-i1).forEach(System.out::println);
		
	}

}
