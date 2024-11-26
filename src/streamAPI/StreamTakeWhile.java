package streamAPI;

import java.util.stream.Stream;

public class StreamTakeWhile {
	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(10,11,33,9,13,2,1,100);

	     numbers.takeWhile(n -> n > 4).forEach(System.out::println); 
	     System.out.println(".......................");
	     numbers = Stream.of(12,2,4,3,4,3,4,5,6,7,8,9);
	     numbers.takeWhile(n -> n%2==0).forEach(System.out::println);
	     System.out.println(".......................");
	     
	     numbers = Stream.of(1,2,3,4,5,6,7,8,9);
	     numbers.takeWhile(n ->n<5).forEach(System.out::println);
	     System.out.println(".......................");
	     
	     numbers = Stream.of(1,2,3,4,5,6,7); 
	     
	     numbers.takeWhile(n -> n>7).forEach(System.out::println);
	    
	}
	

}
