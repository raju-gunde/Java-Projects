package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDemos {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c", "d");
		String result = list.stream().collect(Collectors.joining("---"));// this is joinig used to join the pair of
		// list...
		System.out.println(result);
		System.out.println("....................");
		List<String> lis = Arrays.asList("raju", "king", "is", "ravi", "teja");
		// using group by based on there length
		Map<Integer, List<String>> m1 = lis.stream().collect(Collectors.groupingBy(String::length));
		m1.forEach((ll, words) -> {
			System.out.println(ll + ":" + words);
		});
		System.out.println("....................");
		List<String> listOfCountry = Arrays.asList("India", "usa", "uk", "aus", "srilanka", "rsa");
		Map<String, Integer> map = listOfCountry.stream()
				.collect(Collectors.toMap(item -> item, item -> item.length()));
		///using map based on their data and length.... 
		map.forEach((key, value) -> {
			System.out.println(key + ":  " + value);

		});

		//
	}

}
