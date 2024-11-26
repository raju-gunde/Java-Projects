package streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamLimitDemo {
	public static void main(String[] args) {
		
		List<Integer> l1=Arrays.asList(1,6,23,5,4,3,4,5,3,6,3,5);
       l1.stream().limit(8).sorted().forEach(System.out::println);
       
		
	}
	

}
