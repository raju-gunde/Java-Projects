package Strings_demo1;

public class StringRevers {
	public static void main(String[] args) {
		String str="archane";
		int count=0;
		//String s2="";
		int n=str.length();
		for(int i=0;i<n;i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
	                || str.charAt(i) == 'i'
	                || str.charAt(i) == 'o'
	                || str.charAt(i) == 'u') {
				       System.out.println(str.charAt(i));
	                
	            }
		}
		
}}
