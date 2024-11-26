package Stringsdemos;

public class StringDemo5 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("ravi");
		sb.insert(0, "raju");
		System.out.println(sb);
		StringBuilder sb2 = new StringBuilder("Hello");
		sb2.insert(1, "Java");
		System.out.println(sb2);

		StringBuffer ss = new StringBuffer("java");
		ss.reverse();
		System.out.println(ss);
	}

}
