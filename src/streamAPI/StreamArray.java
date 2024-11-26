package streamAPI;

import java.util.stream.Stream;

public class StreamArray {
	public static void main(String[] args) {
//		Stream<Integer> st1=Stream.of(1,2,3,4,5,6);
////		st1.forEach(p -> System.out.println(p));
//		System.out.println(st1);
		Stream<Integer> strm = Stream.of( new Integer[]{15,29,45,8,16} );
//		strm.forEach(p -> System.out.println(p));
		
		System.out.println(strm);
	}

}
