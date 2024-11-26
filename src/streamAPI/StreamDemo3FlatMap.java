package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo3FlatMap {
	public static void main(String[] args) {
		List<String> l1=Arrays.asList("a","b","c");
		List<String> l2=Arrays.asList("c","d","e");
		List<String> l3=Arrays.asList("f","g","h");
		List<List<String>> l4=Arrays.asList(l1,l2,l3);
		l4.forEach(System.out::println);
		//using flat map 
		List<String> col=l4.stream().flatMap(p ->p.stream()).collect(Collectors.toList());
		System.out.println(col);
		List<String> col1=col.stream().map(p->p.toUpperCase()).collect(Collectors.toList());
		System.out.println(col1);
		
		
		
	}

}
