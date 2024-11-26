package Stringsdemos;

import java.util.Scanner;

public class StringRevers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String ss = sc.next();
		for (int i = ss.length() - 1; i >= 0; i--) {
			System.out.print(ss.charAt(i));
		}
       System.out.println("...............");
		StringBuilder sb = new StringBuilder(ss);
		sb.reverse();
		System.out.println(sb);
	}

}
