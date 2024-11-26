package streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stereamdemo {
	public static void main(String[] args) {
		List<String> s1 = new ArrayList<String>();
		s1.add("apple");
		s1.add("ball");
		s1.add("cat");
		Stream<String> st=s1.stream();
		st.forEach(p -> System.out.println(p));
		Predicate<String> s=p ->p.startsWith("a")&&p.endsWith("e");
//		for (String k : s1) {
//			if(s.test(k)) {
//				System.out.println(k);
//			}
//			
//		}
		

	}

}
