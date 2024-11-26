package Stringsdemos;

public class Strringdemo2 {
	public static void main(String[] args) {
		String s1="raju";
		String s2=new String("raju");
		System.out.println(s1==s2);
		String s3=s2.intern();
		System.out.println(s1==s3);
	}

}
