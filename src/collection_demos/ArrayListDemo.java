package collection_demos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> arl = new ArrayList<>();//Generic type		
		arl.add("Apple");   
		arl.add("Orange");
		arl.add("Grapes");
		arl.add("Mango");
		arl.add("Guava");
		arl.add("Mango");
		Collections.sort(arl);
		System.out.println("InAssending Order");
		arl.forEach(System.out::println);
		Collections.reverse(arl);
		System.out.println("In revers Order");
		arl.forEach(System.out::println);
		
	}

}
