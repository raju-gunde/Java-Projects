package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsDemo3 {
	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(1, 4, 2, 3, 6, 7, 2);
		// partitioningBy based on list interface
		Map<Boolean, List<Integer>> mm = ll.stream().collect(Collectors.partitioningBy(p -> p % 2 == 0));
		System.out.println(mm);
		// partitioningBy based on set interface
		Map<Boolean, Set<Integer>> pp = ll.stream()
				.collect(Collectors.partitioningBy(n -> n % 2 == 1, Collectors.toSet()));
		System.out.println(pp);
		// partitioningBy based on counting...
		Map<Boolean, Long> ml = ll.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.counting()));
		System.out.println(ml);

	}

}
