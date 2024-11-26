package Stringsdemos;

public class StringDemo1 {
	public static void main(String[] args) throws InterruptedException {
		// string there are there ways we can create
		String r1 = "raju";
		String r2 = new String("raju");
		char s[] = { 'r', 'a', 'j', 'u' };
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(s);
		System.out.println("...................");
		String str = "india";
		System.out.println(str.hashCode());
		str = null;
		System.out.println(str);
		System.gc();
		System.out.println("Main is waiting for 5 Sec..");
		Thread.sleep(5000);
		System.out.println("Main thread wake up..");
		String str1 = "india";
		System.out.println(str1.hashCode());

	}

}
