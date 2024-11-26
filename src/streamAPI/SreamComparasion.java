package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class SreamComparasion {
	public static void main(String[] args) {
		List<Integer> s1=Arrays.asList(1,2,3,4,5,6);
		List<Integer> ls1=new ArrayList<Integer>();
	
		for(Integer i : s1){
			if(i%2==0) 
				ls1.add(i);
			
			
		}
		System.out.println(ls1);
		//by using stream Api
		System.out.println("by using for each method");
	    ls1.stream().filter(num -> num%2==0).forEach(System.out::println);
	    //by using collectors tolist
	    System.out.println("Using Collectors.toList()");
        List<Integer> listOfEven = ls1.stream().filter(num -> num%2==0).collect(Collectors.toList());
     listOfEven.forEach(System.out::println);
	    //by using collectors toset
//  
     
	}

	

}
