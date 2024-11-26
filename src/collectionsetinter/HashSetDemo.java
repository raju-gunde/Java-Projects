package collectionsetinter;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		/*HashSet<String> hs=new  HashSet<String>();
		 hs.add("Ravi");  
		  hs.add("Vijay");
		  hs.add("Ravi");
		  hs.add("Ajay");
		  hs.add("Palavi");
		  hs.add("Sweta");
		  hs.add(null);   
		  hs.add(null);
		  hs.forEach(str -> System.out.println(str));*/

	    HashSet<Integer> hs = new HashSet<>();
		hs.add(67); 
		hs.add(89);		
		hs.add(33);
		hs.add(45);
		hs.add(12);
		hs.add(35);			
		
		hs.forEach(str-> System.out.println(str));
	}
	}

