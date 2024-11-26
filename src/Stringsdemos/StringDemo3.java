package Stringsdemos;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StringDemo3 {
	public static void main(String[] args) {
		String s = "raju";
		s.toUpperCase();
		System.out.println(s);
		String x = new String("india"); // immutable
		x.toUpperCase();
		System.out.println(s);
		System.out.println();// will print india in small letter
		String r1 = new String("raju");
		String r2 = r1.toUpperCase();
		System.out.println(r2);
		System.out.println(r1 == r2);

	}

}
