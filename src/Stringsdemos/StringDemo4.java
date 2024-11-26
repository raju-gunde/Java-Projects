package Stringsdemos;

public class StringDemo4 {
	public static void main(String[] args) {
		//this is StringBuilder it s mutable so its not synchronized performance is fast ......
		StringBuilder sb1 = new StringBuilder("arjun");
		sb1.append("karna");
		System.out.println(sb1);
		//this is StringBuffer it s mutable so its synchronized performance is slow ...
		StringBuffer sb2 = new StringBuffer("ramraj");
		sb2.append("katton");
		System.out.println(sb2);
		//this is immutable so modification is not possible...

		String s = new String("ravi");
		s.concat("raju");
		System.out.println(s);
	}

}
