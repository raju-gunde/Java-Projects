package Stringsdemos;



public class StringDemoEquals {
	public static void main(String[] args) {
		String username = "Ravi";

		if (username.equals("Ravi")) {
			System.out.println(" using equals method......:Welcome Ravi");
		} else {
			System.out.println("Sorry! wrong username /Password");
		}
		if (username.equalsIgnoreCase("ravi")) {
			System.out.println("using equals ignore method...:welocme raju");
		} else {
			System.out.println("sorry ravi");
		}
		// deference b/n equals and ==oparator...
		String s1 = "raju";
		String s2 = "raju";
		String s3 = new String("raju");
		System.out.println(s1 == s3);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() + " " + s2.hashCode());
		System.out.println(s2.hashCode() + " " + s3.hashCode());
		// String length...
		String ss = "king";
		System.out.println(ss.length());

	}

}
