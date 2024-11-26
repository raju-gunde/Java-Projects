package streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreaamSorting {
    public static void main(String[] args) {
		List<String> l2=Arrays.asList("akk","bsjd","kauhwd","kauhwd","kirand");
		//l2.stream().filter(s ->s.startsWith("a")).sorted().distinct().forEach(System.out::println);
		l2.stream().filter(p ->p.startsWith("k")&&p.endsWith("d")).distinct().forEach(System.out::println);
	}

}
