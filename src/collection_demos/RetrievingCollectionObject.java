package collection_demos;

import java.util.Enumeration;
import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;



public class RetrievingCollectionObject {

	public static void main(String[] args) {
	   Vector<String> data=new Vector<>();
	   data.add("apple");
	   data.add("mango");
	   data.add("orange");
	   data.add("banana");
	   System.out.println("using to string");
	   System.out.println(data.toString());
	   System.out.println("by using ordinary forloop");
	   for(int i=0;i<data.size();i++) {
		   System.out.println(data.get(i));
	   }
	   
	   System.out.println("by using foreach loop");
	   for(String fruit:data) {
		   System.out.println(fruit);
	   }
	   
	   System.out.println("BY USING ENUMERATION INTERFACE :");
	   Enumeration<String> ele=data.elements();
	   while(ele.hasMoreElements()) {
		   System.out.println(ele.nextElement());
	   }
	   System.out.println("BY USING ITERATOR INTERFACE :");
	   Iterator<String> itr = data.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	   System.out.println("by using ListIteratot:");
	  ListIterator<String> ltr=data.listIterator();
	  while(ltr.hasNext()) {
		  System.out.println(ltr.next());
  }
	  System.out.println("IN BACKWARD DIRECTION :");
	  
	  while(ltr.hasPrevious()) {
		  System.out.println(ltr.previous());
	  }
	  System.out.println("BY USING SPLITITERATOR :");
	  
	  Spliterator<String> splItr = data.spliterator();
		splItr.forEachRemaining(fruit -> System.out.println(fruit));
		System.out.println("BY USING FOR EACH METHOD :");
		data.forEach(fruit -> System.out.println(fruit.toUpperCase()));
		
		System.out.println("BY USING METHOD REFERENCE :");
		data.forEach(System.out::println);
		
		
		
	}

}
