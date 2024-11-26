package collection_demos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReversList01 {
	public static void main(String[] args) {
		List<String> l1=Arrays.asList("A","b","c","d");
		Collections.reverse(l1);
		//ListIterator<String> l2=(ListIterator<String>) l1.iterator();
		ListIterator<String> itr=l1.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}