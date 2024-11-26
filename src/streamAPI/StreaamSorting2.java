package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreaamSorting2 {
	
	public static void main(String[] args) {
		List<String> s=Arrays.asList("a","s","k","g");
		List<String> sort=s.stream().sorted().collect(Collectors.toList());
      System.out.println(sort);
		
	}


}
